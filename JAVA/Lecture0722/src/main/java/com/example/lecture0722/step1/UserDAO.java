package com.example.lecture0722.step1;

import java.sql.*;

public class UserDAO {
    //todo: 새로운 사용자 등록 + id 값을 가지고 사용자 검색
    /**사용자 등록 - User라는 클래스 객체를 받아 뽑아서 사용*/
    // 외부 리소스를 사용하기 때문에 예기치못할 에러를 잡기위해 try-catch 가 필요하다 하지만 그때마다 사용하기 힘듬 => throw
    public void insert(User user) throws ClassNotFoundException, SQLException{

        //1. driver 로드
        Class.forName("com.mysql.cj.jdbc.Driver"); //forName: drive 부터 로딩한다
        //2. 데이터베이스 연결결
        String jdbc_URL = "jdbc:mysql://localhost:3306/sqldb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
        Connection con = DriverManager.getConnection(jdbc_URL,"root","kim8480848");

        String sql = "INSERT INTO users VALUES(?,?,?)";
        //3. SQL을 위한 객체 생성 => 구문해석 X 전달 역할
        PreparedStatement pstmt = con.prepareStatement(sql);
        //4. 불러온 값의 결과 처리
        pstmt.setString(1, user.getId());
        pstmt.setString(2, user.getName());
        pstmt.setString(3, user.getPassword());

        pstmt.executeUpdate(); //update - insert, update, delete
        pstmt.close();
        con.close();
    }
        //vo 객체 하나 만들어서 리턴 => 받은 값을 데이터베이스에서 찾고 => vo 객체화 하여 리턴한다
    public User select(String id) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver"); //forName: drive 부터 로딩한다
        String jdbc_URL = "jdbc:mysql://localhost:3306/sqldb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
        Connection con = DriverManager.getConnection(jdbc_URL,"root","kim8480848");

        String sql = "SELECT * FROM users WHERE id = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, id);
        ResultSet rs = pstmt.executeQuery(); //select 만
        rs.next(); //데이터 당기기

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
