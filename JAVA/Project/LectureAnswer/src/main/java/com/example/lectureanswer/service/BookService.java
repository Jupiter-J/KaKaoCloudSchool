package com.example.lectureanswer.service;

import java.util.ArrayList;

import com.example.lectureanswer.dao.BookDAO;
import com.example.lectureanswer.vo.BookVO;


public class BookService {

	private BookDAO dao;
	
	public BookService() {
		this.dao = new BookDAO();
	}
	
	public ArrayList<BookVO> bookSearchByKeyword(String keyword) {
		// 키워드를 이용해서 책는 로직을 처리
		// for, if 로직처리가 일반적으로 나오는데
		// Database 처리를 해야 해요!
		ArrayList<BookVO> result = dao.select(keyword);
		System.out.println("service" + result);
		return result;
	}
	
	public void bookDeleteByISBN(String bisbn) {
		// 책 고유번호를 받아서 해당 책을 삭제하는 로직 처리
	}
}
