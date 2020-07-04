package com.gris.snmp.pojo;

public class TargetData {

    private String communityName;

    private String hostIp;

    private Integer port;

    private Integer version;

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }



    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "TargetData{" +
                "communityName='" + communityName + '\'' +
                ", hostIp='" + hostIp + '\'' +
                ", port=" + port +
                ", version=" + version +
                '}';
    }
}
