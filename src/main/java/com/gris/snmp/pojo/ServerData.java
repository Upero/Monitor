package com.gris.snmp.pojo;

import java.sql.Timestamp;

public class ServerData {
    private Integer id;
    private String systemInfo;
    private Integer totalRAM;
    private Integer usingRAM;
    private String precentOfRAM;
    private String userPrecentCpu;
    private String systemPrecentCpu;
    private String freePrecentCpu;
    private Timestamp monitorTime;

    @Override
    public String toString() {
        return "ServerData{" +
                "id=" + id +
                ", systemInfo='" + systemInfo + '\'' +
                ", totalRAM=" + totalRAM +
                ", usingRAM=" + usingRAM +
                ", precentOfRAM='" + precentOfRAM + '\'' +
                ", userPrecentCpu='" + userPrecentCpu + '\'' +
                ", systemPrecentCpu='" + systemPrecentCpu + '\'' +
                ", freePrecentCpu='" + freePrecentCpu + '\'' +
                ", monitorTime='" + monitorTime + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSystemInfo() {
        return systemInfo;
    }

    public void setSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo;
    }

    public Integer getTotalRAM() {
        return totalRAM;
    }

    public void setTotalRAM(Integer totalRAM) {
        this.totalRAM = totalRAM;
    }

    public Integer getUsingRAM() {
        return usingRAM;
    }

    public void setUsingRAM(Integer usingRAM) {
        this.usingRAM = usingRAM;
    }

    public String getPrecentOfRAM() {
        return precentOfRAM;
    }

    public void setPrecentOfRAM(String precentOfRAM) {
        this.precentOfRAM = precentOfRAM;
    }

    public String getUserPrecentCpu() {
        return userPrecentCpu;
    }

    public void setUserPrecentCpu(String userPrecentCpu) {
        this.userPrecentCpu = userPrecentCpu;
    }

    public String getSystemPrecentCpu() {
        return systemPrecentCpu;
    }

    public void setSystemPrecentCpu(String systemPrecentCpu) {
        this.systemPrecentCpu = systemPrecentCpu;
    }

    public String getFreePrecentCpu() {
        return freePrecentCpu;
    }

    public void setFreePrecentCpu(String freePrecentCpu) {
        this.freePrecentCpu = freePrecentCpu;
    }

    public Timestamp getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Timestamp monitorTime) {
        this.monitorTime = monitorTime;
    }
}
