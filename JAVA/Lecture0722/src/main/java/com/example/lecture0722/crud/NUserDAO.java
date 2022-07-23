package com.example.lecture0722.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NUserDAO implements ConnectionMaker{
    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String jdbc_URL = "jdbc:mysql://localhost:3306/book?characterEncoding=UTF-8&serverTimezone=UTC&userSSL=false";
        Connection con = DriverManager.getConnection(jdbc_URL,"root","jupiter*");
        return con;
    }
}
