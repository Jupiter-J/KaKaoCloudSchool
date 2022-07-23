package com.example.lecture0722.crud;


import java.sql.Connection;
import java.sql.SQLException;

public interface ConnectionMaker {

    //실제 데이터베이스와 연결하는 부분
    public Connection makeConnection() throws ClassNotFoundException, SQLException;
}
