package member.dao;

import member.vo.Member;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    /**
     커넥션풀에는 여러개의 Connection 객체가 생성되어 운용되는데, 이를 직접 웹 애플리케이션에서 다루기 힘들기 때문에
     DataSource라는 개념을 도입하여 사용
     DataSource는 커넥션 풀을 관리하기 위한 객체
     */
    private DataSource ds;

    public UserDAO() throws ClassNotFoundException, NamingException{
        Class.forName("com.mysql.jdbc.Driver");
        Context init = new InitialContext();
        ds = (DataSource) init.lookup("java:comp/env/jdbc/MySQLDB");
    }

    public Member select(Member member) throws SQLException {
        Connection con = ds.getConnection();
        System.out.println("커넥션 획득");
        String sql = "SELECT * FROM members WHERE id=? AND pw=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, member.getId());
        pstmt.setString(2, member.getPw());

        ResultSet result = pstmt.executeQuery();
        if (result.next()){
            member.setName(result.getString("name"));
            return member;
        }

        return null;
    }



}
