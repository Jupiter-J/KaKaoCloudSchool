package com.example.book.simpleBookSearch.service;

import com.example.book.simpleBookSearch.dao.BookDAO;
import com.example.book.simpleBookSearch.vo.BookVO;

import java.util.ArrayList;

//로직처리
public class BookService {
    private BookDAO dao;

    //생성자추가 - 객체 만들기 위해
    public BookService(){

        this.dao = new BookDAO();
    }

    // 검색 + 삭제 로직 만들기
    public ArrayList<BookVO> bookSearchByKeyword(String keyword){

        //키워드가 전달되려면? 인자로 받아야 함
            //for, if 로직처리가 일반적으로 나오는데 Databse 처리를 한다
       /**단일 테이블에 대한 메소드 이름을 넣기! 비즈니스로직처럼 생긴것들은 DAO에서!*/
       // dao.select(keyword); //인자를 집어넣어줘야 실행
        ArrayList<BookVO> result = dao.select(keyword);
        return result;
    }

    public void bookDeleteByISBN(String bisbn){


    }


}
