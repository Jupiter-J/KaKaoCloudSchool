package com.example.lectureanswer.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.example.lectureanswer.vo.BookVO;

public class BookDAO {

	public BookDAO() {
		//객체가 만들어질 때 사용
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			System.out.println("드라이버 로딩 성공!");			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	//TODO: 도서 조회
	public ArrayList<BookVO> select(String keyword) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<BookVO> list = null;
		try {
			String jdbcURL = "jdbc:mysql://localhost:3306/book?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
			con = DriverManager.getConnection(jdbcURL,"root","jupiter*");

			String sql = "select btitle,bauthor,bisbn from book where btitle like ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword + "%");
			
			rs = pstmt.executeQuery();
			
			list = new ArrayList<BookVO>();
			
			while(rs.next()) {
				BookVO tmp = new BookVO();
				tmp.setBtitle(rs.getString("btitle"));
				tmp.setBauthor(rs.getString("bauthor"));
				tmp.setBisbn(rs.getString("bisbn"));
				list.add(tmp);
			}
			
		} catch (Exception e2) {
			System.out.println(e2);
		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		System.out.println("DAO = "+ list);
		return list;
	}

	//TODO: 도서 삭제
	public int delete(String bisbn){
		Connection con = null;
		PreparedStatement pstmt = null;
		//ResultSet rs = null;
		int result = 0;

		try {
			String jdbcURL = "jdbc:mysql://localhost:3306/mission?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
			con = DriverManager.getConnection(jdbcURL,"root","kim8480848");

			String sql = "delete from book where bisbn = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bisbn);

			result = pstmt.executeUpdate();

			if ( result == 1 ) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
		} catch (Exception e3) {
			// TODO: handle exception
		}finally {
			try {
			//	rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e4) {
				e4.printStackTrace();
			}
		}
		System.out.println("DAO = "+ result);
		return result;

	}
}
