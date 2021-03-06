package com.example.book.simpleBookSearch.dao;

import com.example.book.simpleBookSearch.vo.BookVO;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;

import static com.example.book.mission.MainDBCP.getDataSource;

public class BookDAO {
    //특정테이블에 대한 조회, 입력, 삭제만 가능
    //로직 처리를 하면 안된다
    ArrayList<BookVO> list = null;
    public BookDAO(){
        //객체가 만들어질 때 사용
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버 로딩 성공!");
        }catch (Exception e){

        }
    }


    public ArrayList<BookVO> select(String keyword){
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs2 = null;

        //1. JDBC driver loading - 내가사용하는 데이터베이스의 드라이버 클래스명을 입력
        // MySQL8.0부터는 아래의 class 를 사용한다
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");

            //2. 실제 데이터베이스에 연결    프로토콜        DBMS   스키마명                         //타임존
            String jdbcURL = "jdbc:mysql://localhost:3306/bookstore?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
            // 접속에 성공하면 Connection 이라는 객체가 생긴다
            con = DriverManager.getConnection(jdbcURL,"root","jupiter*");
            System.out.println("데이터베이스 연결 성공");


            String sql = "SELECT userID, name, addr FROM usertbl";
            //3. Statement 생성
            //3-2 PreparedStatement
            pstmt = con.prepareStatement(sql);

            //4. 쿼리 실행
            //Statement 를 사용해서 sql 쿼리를 DBMS 에 실제로 전달한다
            //전처리된 sql 문장 실행
            rs2 = pstmt.executeQuery();

            //5. 결과 처리
            //가져온값 전체를 돌아라 .next() 끝에 도달하면 false가 나옴


            while (rs2.next()){
                /** 빈 객체를 만들어서 넣는다*/
                BookVO tmp = new BookVO();
                tmp.setBtitle(rs2.getString("btitle"));
                tmp.setBauthor(rs2.getString("bauthor"));
                list.add(tmp);
            }

        } catch (ClassNotFoundException e) { //Class.forName
            throw new RuntimeException(e);
        } catch (SQLException e2) {  //DriverManager.getConnection
            throw new RuntimeException(e2);
        }finally {
            //finally exception이 뜨거나 말거나 무조건 실행
            try {
                //자원들을 각각하나씩 해제 해야한다
                if (rs2 != null) rs2.close();
                if (pstmt != null) pstmt.close();
                if (con != null)
                    con.close(); //자원을 아끼기 위해 닫아주기
            }catch (Exception e){
            }
        }
        return list;
    }
}
