package com.gris.snmp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@MapperScan("com.gris.snmp.mapper")
@EnableScheduling   //开启定时任务
public class MonitorappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MonitorappApplication.class, args);
    }

}
