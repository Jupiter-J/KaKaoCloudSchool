package com.example.lecture0722.step4;

import java.sql.Connection;
import java.sql.SQLException;

//todo: 추상메소드화 시킨다
public interface ConnectionMaker {
    public Connection makeConnection() throws ClassNotFoundException, SQLException;
}
