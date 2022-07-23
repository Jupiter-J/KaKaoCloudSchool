package com.example.lecture0722.step3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    //todo: userDAO를 다른 방식으로 만들어 보자 => UserDAO에는 비즈니스 로직만 남는다
    /** 분리한 클래스를 필드에 잡는다 UserDAO가 생성될때 내부에서 같이 만든다
     connectin을 얻어오는것을 하위에서 얻어오는 방식으로 했었다 로직은 상위로 두고
     하지만 이번 방식은 클래스자체를 분리 connection을 가져오는것은 다른 클래스, 나머지 구현은 현재클래스
     * */
    //2. 필드에 박는다
    private SimpleConnectionMaker simpleConnectionMaker;

    public UserDAO(){
        simpleConnectionMaker = new SimpleConnectionMaker();
    }

    public void insert(User user) throws ClassNotFoundException, SQLException{

        Connection con = simpleConnectionMaker.makeNewConnection();
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
        Connection con = simpleConnectionMaker.makeNewConnection();
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
