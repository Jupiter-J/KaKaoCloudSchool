package member.dao;

import member.vo.Member;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;

public class MemberDAO {
    private DataSource ds;

    public MemberDAO() throws NamingException, ClassNotFoundException {
//        Class.forName("com.mysql.jdbc.Driver");
        Context init = new InitialContext();
        //init을 사용하여 데이터소스를 찾을 수 있다
        ds = (DataSource) init.lookup("java:comp/env/jdbc/MySQLDB"); //object 타입이라 다운캐스팅한다

        System.out.println(ds.toString());
    }

    public Member select(Member member) throws SQLException, ClassNotFoundException {

        Connection con = ds.getConnection();
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        System.out.println("드라이버 로딩 성공!");
//        // 2. 데이터베이스 연결
//        String jdbcURL = "jdbc:mysql://localhost:3306/book?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
//        Connection conn = DriverManager.getConnection(jdbcURL,"root","Kim8480848*");
//        System.out.println("데이터 베이스 연결 성공!");

        System.out.println("connection 획득 성공!");

        String sql = "SELECT * FROM members WHERE id=? AND pw=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, member.getId());
        pstmt.setString(2, member.getPw());

        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            //로그인이 되었다
            member.setName(rs.getString("name"));
            System.out.println("DAO" + member.getName());
            if(rs != null) {
                rs.close();
            }
            if(pstmt != null) {
                pstmt.close();
            }
            if(con != null) {
                con.close();
            }
            return member;
        }
        return null;
    }

}
