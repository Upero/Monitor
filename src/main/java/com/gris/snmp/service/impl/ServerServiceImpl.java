package com.gris.snmp.service.impl;

import com.gris.snmp.service.ServerService;
import com.gris.snmp.mapper.ServerMapper;
import com.gris.snmp.pojo.ServerData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ServerServiceImpl implements ServerService {


    @Autowired
    ServerMapper serverMapper;

    @Override
    public ServerData findById(Integer id) {
        return serverMapper.findById(id);
    }

    @Override
    public void insertServerData(ServerData serverData) {
        serverMapper.insertServerData(serverData);
    }


}
