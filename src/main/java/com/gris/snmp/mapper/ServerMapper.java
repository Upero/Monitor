package com.gris.snmp.mapper;

import com.gris.snmp.pojo.ServerData;
import org.apache.ibatis.annotations.Param;



public interface ServerMapper {

    void insertServerData(@Param("serverData") ServerData serverData);

    ServerData findById(@Param("id") Integer id);

}
