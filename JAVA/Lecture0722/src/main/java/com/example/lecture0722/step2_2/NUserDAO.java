package com.example.lecture0722.step2_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//TODO: dao를 사왔다 네이버쪽 개발자가 해당 usrDAO를 이용하기 위해 하위 클래스를 작성해서 사용한다
public class NUserDAO extends UserDAO{

    @Override //추상 클래스를 상속받음으로 반드시 사용하게된다 => 자신의 연결방법에 대한 구현을 하면 된다
    protected Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String jdbc_URL = "jdbc:mysql://localhost:3306/sqldb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
        Connection con = DriverManager.getConnection(jdbc_URL,"root","kim8480848");
        return con;
    }
}
