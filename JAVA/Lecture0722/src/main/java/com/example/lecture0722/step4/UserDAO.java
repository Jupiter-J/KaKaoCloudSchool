package com.example.lecture0722.step4;

import com.example.lecture0722.step4.NUserDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    //인터페이스 타입을 필드로 잡음 - 인터페이스의 객체를 못만들고 구현한 클래스로 생성가능
    private ConnectionMaker connectionMaker;

    public UserDAO(){
        //구현체의 메소드 호출 - 팔기도 전에 고객의 클래스(실제 구현체 클래스)가 있어야 객체 생성이 가능
        //but: 다른 클래스의 이름이 명시적으로 박힘
        connectionMaker = new NUserDAO();
    }
    public void insert(User user) throws ClassNotFoundException, SQLException{
                            //인터페이스를 구현한 클래스의 메소드가 호출된다 : 동적바인딩
        Connection con = connectionMaker.makeConnection();
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
        Connection con = connectionMaker.makeConnection();
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
