package com.gris.snmp.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "snmpinfo")
@PropertySource("classpath:snmpinfo.properties")
public class SnmpInfo {
    private Integer timeout ;

    @Override
    public String toString() {
        return "SnmpInfo{" +
                "timeout=" + timeout +
                ", retries=" + retries +
                '}';
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Integer getRetries() {
        return retries;
    }

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    private Integer retries ;
}
