package com.gris.snmp.resource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "serverinfo")
@PropertySource("classpath:serverinfo.properties")
public class ServerInfo {
    private String thip;
    private String lxip;
    private Integer thversion;
    private Integer lxversion;
    private Integer thport;
    private Integer lxport;
    private String thCName;
    private String lxCName;

    @Override
    public String toString() {
        return "ServerInfo{" +
                "thip='" + thip + '\'' +
                ", lxip='" + lxip + '\'' +
                ", thversion=" + thversion +
                ", lxversion=" + lxversion +
                ", thport=" + thport +
                ", lxport=" + lxport +
                ", thCName='" + thCName + '\'' +
                ", lxCName='" + lxCName + '\'' +
                '}';
    }

    public String getThCName() {
        return thCName;
    }

    public void setThCName(String thCName) {
        this.thCName = thCName;
    }

    public String getLxCName() {
        return lxCName;
    }

    public void setLxCName(String lxCName) {
        this.lxCName = lxCName;
    }

    public String getThip() {
        return thip;
    }

    public void setThip(String thip) {
        this.thip = thip;
    }

    public String getLxip() {
        return lxip;
    }

    public void setLxip(String lxip) {
        this.lxip = lxip;
    }

    public Integer getThversion() {
        return thversion;
    }

    public void setThversion(Integer thversion) {
        this.thversion = thversion;
    }

    public Integer getLxversion() {
        return lxversion;
    }

    public void setLxversion(Integer lxversion) {
        this.lxversion = lxversion;
    }

    public Integer getThport() {
        return thport;
    }

    public void setThport(Integer thport) {
        this.thport = thport;
    }

    public Integer getLxport() {
        return lxport;
    }

    public void setLxport(Integer lxport) {
        this.lxport = lxport;
    }
}
