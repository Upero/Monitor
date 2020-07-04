package com.gris.snmp.pojo;

import java.sql.Timestamp;
import java.util.Date;

public class TemAndHum {

    private Integer id;
    private String temperature;
    private String humidity;
    private Timestamp collectTime;

    @Override
    public String toString() {
        return "TemAndHum{" +
                "id=" + id +
                ", temperature='" + temperature + '\'' +
                ", humidity='" + humidity + '\'' +
                ", collectTime=" + collectTime +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Timestamp collectTime) {
        this.collectTime = collectTime;
    }
}
