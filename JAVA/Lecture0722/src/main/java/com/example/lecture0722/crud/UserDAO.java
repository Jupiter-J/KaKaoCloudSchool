package com.example.lecture0722.crud;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    //필드에 넣고 메소드마다 생성 안하고 쓰겠다
    private ConnectionMaker connectionMaker;

    //DI - 객체를 주입받는다
    public UserDAO(ConnectionMaker connectionMaker) {
        this.connectionMaker = connectionMaker;
    }

    //userCreate - 값만 집어넣고 끝낼꺼라 void 타입!
    public void insert(User user) throws SQLException, ClassNotFoundException {
        //Connection 타입의 변수에 DI로 가져온 객체를 넣어줘야지!
        Connection connection = connectionMaker.makeConnection();

        String sql = "INSERT INTO users VALUES(?,?,?)";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1,user.getId());
        pstmt.setString(2,user.getName());
        pstmt.setString(3,user.getPassword());

        pstmt.executeUpdate();
        pstmt.close();
        connection.close();
    }

    //userRead - 이름조회
    public List<User> select(String name) throws SQLException, ClassNotFoundException{
        Connection connection = connectionMaker.makeConnection();
        String sql = "select id, name, password from users where name like ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1,"%" + name + "%");
        //쿼리에서 불러온 결과값
        ResultSet rs = pstmt.executeQuery();

        ArrayList list = new ArrayList<User>();
        while (rs.next()){
            User resUser = new User();
            resUser.setId(rs.getInt("id"));
            resUser.setName(rs.getString("name"));
            resUser.setPassword(rs.getString("password"));
            list.add(resUser);
        }
        pstmt.close();
        connection.close();
        return list;
    }

    //userUpdate
    public void update() throws SQLException, ClassNotFoundException{

    }

    //userDelete
    public void delete() throws SQLException, ClassNotFoundException{

    }

}
