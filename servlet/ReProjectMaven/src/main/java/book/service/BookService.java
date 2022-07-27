package book.service;

import book.dao.BookDAO;
import book.vo.Book;

import java.util.ArrayList;

public class BookService {

	public ArrayList<Book> searchByKeyword(String keyword) {

		ArrayList<Book> list = null;
		// 로직처리
		try {
			BookDAO dao = new BookDAO();
			list = dao.select(keyword);			
		} catch (Exception e) {
			System.out.println(e);
		}
				
		return list;
	}

}
