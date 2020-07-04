package com.gris.snmp.service;

import com.gris.snmp.pojo.ServerData;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public interface ServerService {

    ServerData findById(Integer id);

    void insertServerData(ServerData serverData);

}
