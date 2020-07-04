package com.gris.snmp;

import com.gris.snmp.mapper.ThMapper;
import com.gris.snmp.pojo.TemAndHum;
import com.gris.snmp.resource.ServerInfo;
import com.gris.snmp.resource.SnmpInfo;
import com.gris.snmp.service.ServerService;
import com.gris.snmp.pojo.ServerData;
import com.gris.snmp.service.SnmpService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.util.Date;

@SpringBootTest
class MonitorappApplicationTests {

    @Autowired
    ServerInfo serverInfo;

    @Autowired
    SnmpInfo snmpInfo;

    @Autowired
    ServerService serverDao;

    @Autowired
    SnmpService snmpService;

    @Autowired
    ThMapper thMapper;

//    @Test
//    void ServerDataTest() {
//
//        ServerData byId = serverDao.findById(1);
//        System.out.println(byId);
//
//        ServerData serverData = new ServerData();
//        serverData.setFreePrecentCpu("99%");
//        serverData.setMonitorTime("12:40");
//        serverData.setSystemInfo("windox");
//        serverData.setTotalRAM(100);
//        serverData.setUsingRAM(50);
//        serverData.setPrecentOfRAM("50%");
//        serverData.setSystemPrecentCpu("1%");
//        serverData.setUserPrecentCpu("0%");
//
//        serverDao.insertServerData(serverData);
//
//    }

    @Test
    void testTemAndHum(){
        System.out.println(serverInfo);
        System.out.println(snmpInfo);
    }
    @Test
    void testHt(){
        String humidity = snmpService.getHumidity();
        System.out.println(humidity);
        String temperature = snmpService.getTemperature();
        System.out.println(temperature);
    }

    @Test
    void testLx(){
        Integer totalRAM = snmpService.getTotalRAM();
        System.out.println(totalRAM);
    }

    @Test
    void testInsertTH(){

        TemAndHum temAndHum = new TemAndHum();
        temAndHum.setTemperature(15+"\u2103");
        temAndHum.setHumidity(45+"%");
        temAndHum.setCollectTime(new Timestamp(new Date().getTime()));
        thMapper.insertThData(temAndHum);

    }

}
