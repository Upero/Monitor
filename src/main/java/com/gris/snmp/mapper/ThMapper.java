package com.gris.snmp.mapper;

import com.gris.snmp.pojo.ServerData;
import com.gris.snmp.pojo.TemAndHum;
import org.apache.ibatis.annotations.Param;

public interface ThMapper {

    void insertThData(@Param("temAndHum") TemAndHum temAndHum);

}
