package com.gris.snmp.service.impl;

import com.gris.snmp.mapper.ThMapper;
import com.gris.snmp.pojo.TemAndHum;
import com.gris.snmp.service.ThService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThServiceImpl implements ThService {

    @Autowired
    ThMapper thMapper;

    @Override
    public void insertThData(TemAndHum temAndHum) {
        thMapper.insertThData(temAndHum);
    }
}
