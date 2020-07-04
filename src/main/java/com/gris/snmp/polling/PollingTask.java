package com.gris.snmp.polling;

import com.gris.snmp.pojo.ServerData;
import com.gris.snmp.pojo.TemAndHum;
import com.gris.snmp.service.ServerService;
import com.gris.snmp.service.SnmpService;
import com.gris.snmp.service.ThService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Date;

@Component
public class PollingTask {

    @Autowired
    SnmpService snmpService;
    @Autowired
    ThService thService;

    @Autowired
    ServerService serverService;

    //每5秒执行一次,采集温度和湿度
    @Scheduled(cron = "0/5 * * * * ?")
    private void collectTH(){
        String temperature = snmpService.getTemperature();
        String humidity = snmpService.getHumidity();
        TemAndHum data = new TemAndHum();
        data.setTemperature(temperature);
        data.setHumidity(humidity);
        data.setCollectTime(new Timestamp(new Date().getTime()));
        thService.insertThData(data);
    }
    //采集服务器信息
    @Scheduled(cron = "0/5 * * * * ?")
    private void collectLx(){
        String systemInfo = snmpService.systemInfo();
        Integer usingRAM = snmpService.getUsingRAM();
        Integer totalRAM = snmpService.getTotalRAM();
        int result = (int)(((double)usingRAM / (double)totalRAM)*100);
        String precentOfRAM = result+"%";
        String userPrecentCpu = snmpService.percentageOfUser()+"%";
        String systemPrecentCpu = snmpService.percentageOfSystem()+"%";
        String freePrecentCpu = snmpService.percentageOfFree()+"%";
        Timestamp monitorTime = new Timestamp(new Date().getTime());
        ServerData serverData = new ServerData();
        serverData.setSystemInfo(systemInfo.split(" ")[1]);
        serverData.setUsingRAM(usingRAM);
        serverData.setTotalRAM(totalRAM);
        serverData.setPrecentOfRAM(precentOfRAM);
        serverData.setUserPrecentCpu(userPrecentCpu);
        serverData.setSystemPrecentCpu(systemPrecentCpu);
        serverData.setFreePrecentCpu(freePrecentCpu);
        serverData.setMonitorTime(monitorTime);
        serverService.insertServerData(serverData);
    }

}
