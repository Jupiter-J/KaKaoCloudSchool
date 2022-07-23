package com.example.lecture0722.step5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    private ConnectionMaker connectionMaker;
    //todo: 객체를 주입받는다 DI
    /**내가 직접 만드는게 아니라 ConnectionMaker 인터페이스를 구현한 객체를 가져온다
     내가 객체를 DAO에서 만들지 않고 받아서 사용하도록 한다  */
    public UserDAO(ConnectionMaker connectionMaker){
        connectionMaker = new NUserDAO();
    }
    public void insert(User user) throws ClassNotFoundException, SQLException{

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
