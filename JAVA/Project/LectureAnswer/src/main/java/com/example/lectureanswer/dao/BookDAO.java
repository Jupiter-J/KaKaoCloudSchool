package com.example.lectureanswer.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.example.lectureanswer.vo.BookVO;

public class BookDAO {

	public BookDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			System.out.println("드라이버 로딩 성공!");			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
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
		System.out.println("DAO"+ list.toString());
		return list;
	}
}
