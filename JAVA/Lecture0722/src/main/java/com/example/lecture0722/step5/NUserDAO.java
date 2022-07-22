package com.example.lecture0722.step4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NUserDAO implements ConnectionMaker{

    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String jdbc_URL = "jdbc:mysql://localhost:3306/sqldb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
        Connection con = DriverManager.getConnection(jdbc_URL,"root","kim8480848");
        return con;
    }




}
