package com.gris.snmp.dao;

import com.gris.snmp.pojo.TargetData;
import com.gris.snmp.resource.SnmpInfo;
import org.snmp4j.CommunityTarget;
import org.snmp4j.PDU;
import org.snmp4j.Snmp;
import org.snmp4j.event.ResponseEvent;
import org.snmp4j.smi.*;
import org.snmp4j.transport.DefaultUdpTransportMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.IOException;

@Repository
public class SnmpDao {


    @Autowired
    SnmpInfo snmpInfo;

    public String send(TargetData targetData, String oid,int ways){
        DefaultUdpTransportMapping transport = null;
        Snmp snmp = null;
        String communityName = targetData.getCommunityName();
        String hostIp = targetData.getHostIp();
        Integer port = targetData.getPort();
        Integer version = targetData.getVersion();
        String result = null;

        try {
            transport = new DefaultUdpTransportMapping();
            snmp = new Snmp(transport);
            snmp.listen();

            CommunityTarget target = new CommunityTarget();

            target.setTimeout(snmpInfo.getTimeout());

            target.setRetries(snmpInfo.getRetries());
            Address address = GenericAddress.parse(hostIp+"/"+port);
            target.setAddress(address);

            target.setVersion(version);
            target.setCommunity(new OctetString(communityName));

            PDU request = new PDU();
            request.add(new VariableBinding(new OID(oid)));
            request.setType(ways);

            ResponseEvent responseEvent = snmp.send(request, target);

            PDU response = responseEvent.getResponse();
            //System.out.println(response);
            result = response.get(0).toValueString();
//            System.out.println(response.get(0));

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(snmp != null){
                try {
                    snmp.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

//    public TargetData createDefaultTarget(){
//        TargetData targetData = new TargetData();
//        targetData.setCommunityName("public");
//        targetData.setVersion(1);
//        targetData.setHostIp("192.168.174.128");
//        targetData.setPort(161);
//        return targetData;
//    }
//
//    public static void main(String[] args) {
//        SnmpDao snmpController = new SnmpDao();
//        TargetData targetData = snmpController.createDefaultTarget();
//        String send = snmpController.send(targetData, ".1.3.6.1.2.1.1.3.0", PDU.GET);
//        System.out.println(send);
//    }
}
