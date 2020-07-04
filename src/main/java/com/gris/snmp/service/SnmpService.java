package com.gris.snmp.service;

import java.sql.Timestamp;

public interface SnmpService {

    //获取系统信息
    public String systemInfo();

    //监控时间
//    public Timestamp monitorTime();

    //用户CPU时间百分比
    public String percentageOfUser();

    //系统CPU时间的百分比
    public String percentageOfSystem();

    //空闲CPU时间的百分比
    public String percentageOfFree();

    //机器中的总RAM
    public Integer getTotalRAM();

    //已经使用的RAM
    public Integer getUsingRAM();

    //温度
    public String getTemperature();

    //湿度
    public String getHumidity();

}
