package com.example.lecture0722.step3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//todo: connection을 별도의 클래스로 만든다
public class SimpleConnectionMaker {
    //커넥션 객체를 만들어서 리턴시킨다
    public Connection makeNewConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String jdbc_URL = "jdbc:mysql://localhost:3306/book?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
        Connection con = DriverManager.getConnection(jdbc_URL,"root","jupiter*");
        return con;
    }
}
