package com.gris.snmp.service;

public class BaseService {

    //系统信息
    public static String system_info = ".1.3.6.1.2.1.1.1.0";

    //监控时间
    public static String monitor_time = ".1.3.6.1.2.1.1.3.0";

    //用户CPU时间百分比
    public static String percentage_of_user_CPU_time = ".1.3.6.1.4.1.2021.11.9.0";
    //系统CPU时间的百分比
    public static String percentages_of_system_CPU_time = ".1.3.6.1.4.1.2021.11.10.0";
    //空闲CPU时间的百分比
    public static String percentages_of_idle_CPU_time = ".1.3.6.1.4.1.2021.11.11.0";

    //机器中的总RAM
    public static String Total_RAM=".1.3.6.1.4.1.2021.4.5.0" ; //1863248
    //已经使用的RAM
    public static String RAM_used =".1.3.6.1.2.1.25.2.3.1.6" ;  //    629320
    //温度
    public static String Temperature="1.3.6.1.4.1.26381.1.0";
    //湿度
    public static String Humidity="1.3.6.1.4.1.26381.2.0";
}
