package com.example.lecture0722.step2;

import java.sql.*;

public class UserDAO {

    //todo: 똑같은 기능을 메소드로 생성하여 묶는다 - 리펙토링(유지보수성 up!)
    private Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver"); //forName: drive 부터 로딩한다
        String jdbc_URL = "jdbc:mysql://localhost:3306/sqldb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
        Connection con = DriverManager.getConnection(jdbc_URL,"root","kim8480848");
        return con;
    }
    public void insert(User user) throws ClassNotFoundException, SQLException{

        Connection con = getConnection();
        String sql = "INSERT INTO users VALUES(?,?,?)";

        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, user.getId());
        pstmt.setString(2, user.getName());
        pstmt.setString(3, user.getPassword());

        pstmt.executeUpdate();
        pstmt.close();
        con.close();
    }
    public User select(String id) throws ClassNotFoundException, SQLException {
       Connection con = getConnection();
        String sql = "SELECT * FROM users WHERE id = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, id);
        ResultSet rs = pstmt.executeQuery();
        rs.next();

        //VO 만들기
        User user = new User();
        user.setId(rs.getString("id"));
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));

        rs.close();
        pstmt.close();
        con.close();
        return user;
    }
}
