package com.gris.snmp.test;


import java.sql.Timestamp;
import java.util.Date;

public class ServerDataTest {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(15+"\u2103");
        System.out.println(new Timestamp(new Date().getTime()));

        Integer d1 = 2;
        Integer d2 = 7;
        int result = (int)(((double)d1 / (double)d2)*100);
        System.out.println(result);
    }

}
