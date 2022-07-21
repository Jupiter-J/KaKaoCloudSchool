package com.example.book.store;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs2 = null;

        //1. JDBC driver loading - 내가사용하는 데이터베이스의 드라이버 클래스명을 입력
        // MySQL8.0부터는 아래의 class 를 사용한다
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");

        //2. 실제 데이터베이스에 연결    프로토콜        DBMS   스키마명                         //타임존
            String jdbcURL = "jdbc:mysql://localhost:3306/sqldb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
             // 접속에 성공하면 Connection 이라는 객체가 생긴다
            con = DriverManager.getConnection(jdbcURL,"root","kim8480848");
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
            String id = rs2.getString(1);
            String name = rs2.getString(2);
            String addr = rs2.getString(3);
            System.out.println(id + ", " + name + ", " + addr);
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



    }
}
