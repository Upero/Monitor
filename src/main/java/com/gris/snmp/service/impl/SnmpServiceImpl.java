package com.gris.snmp.service.impl;

import com.gris.snmp.dao.SnmpDao;
import com.gris.snmp.pojo.TargetData;
import com.gris.snmp.resource.ServerInfo;
import com.gris.snmp.resource.SnmpInfo;
import com.gris.snmp.service.BaseService;
import com.gris.snmp.service.SnmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.snmp4j.PDU;
import java.text.NumberFormat;

@Service
public class SnmpServiceImpl extends BaseService implements SnmpService {

    @Autowired
    SnmpDao snmpDao ;

    @Autowired
    ServerInfo serverInfo;

    private TargetData createLxTarget(){
        TargetData targetData = new TargetData();
        targetData.setCommunityName(serverInfo.getLxCName());
        targetData.setVersion(serverInfo.getLxversion());
        targetData.setHostIp(serverInfo.getLxip());
        targetData.setPort(serverInfo.getLxport());
        return targetData;
    }
    private TargetData createThTarget(){
        TargetData targetData = new TargetData();
        targetData.setCommunityName(serverInfo.getThCName());
        targetData.setVersion(serverInfo.getThversion());
        targetData.setHostIp(serverInfo.getThip());
        targetData.setPort(serverInfo.getThport());
        return targetData;
    }
    //获取系统信息
    public String systemInfo(){
        String result = snmpDao.send(createLxTarget(), system_info, PDU.GET);
        //System.out.println(result);
        return result;
    }


    //监控时间
//    public String monitorTime(){
//        String result = snmpDao.send(createLxTarget(), monitor_time, PDU.GET);
////        System.out.println(result);
//        return result;
//    }

    //用户CPU时间百分比
    public String percentageOfUser(){
        String result = snmpDao.send(createLxTarget(), percentage_of_user_CPU_time, PDU.GET);
//        Integer precent = Integer.parseInt(result);
        return result;
    }

    //系统CPU时间的百分比
    public String percentageOfSystem(){
        String result = snmpDao.send(createLxTarget(), percentages_of_system_CPU_time, PDU.GET);
//        Integer precent = Integer.parseInt(result);
        return result;
    }

    //空闲CPU时间的百分比
    public String percentageOfFree(){
        String result = snmpDao.send(createLxTarget(), percentages_of_idle_CPU_time, PDU.GET);
//        Integer precent = Integer.parseInt(result);
        return  result;
    }

    //机器中的总RAM
    public Integer getTotalRAM(){
        String result = snmpDao.send(createLxTarget(), Total_RAM, PDU.GET);
        Integer totalRAM = Integer.parseInt(result);
        return totalRAM;
    }

    //已经使用的RAM
    public Integer getUsingRAM(){
        String result = snmpDao.send(createLxTarget(), RAM_used, PDU.GETNEXT);
        Integer usingRAM = Integer.parseInt(result);
        return usingRAM;
    }
    public String getPrecentOfRAM(){
        int totalRAM = getTotalRAM();
        int usingRAM = getUsingRAM();
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);
        String result = numberFormat.format((float)usingRAM / (float) totalRAM );
        return result;
    }

    @Override
    public String getTemperature() {
        String temperature = snmpDao.send(createThTarget(), Temperature, PDU.GET);
        return temperature;
    }

    @Override
    public String getHumidity() {
        String humidity = snmpDao.send(createThTarget(), Humidity, PDU.GET);
        return humidity;
    }
}
