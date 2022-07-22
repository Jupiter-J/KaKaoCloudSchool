package com.example.lectureanswer;

import com.example.lectureanswer.service.BookService;
import com.example.lectureanswer.vo.BookVO;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class SimpleBookSearch extends Application {

	TextArea textarea;
	TextField input;
	Button selectBtn, deleteBtn;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// service 객체
		BookService service = new BookService();
		
		BorderPane root = new BorderPane();
		root.setPrefSize(700, 500);

		textarea = new TextArea();
		textarea.setEditable(false);
		root.setCenter(textarea);

		BorderPane bottom = new BorderPane();
		bottom.setPrefHeight(40);
		bottom.setPrefWidth(Double.MAX_VALUE);

		//TODO: 도서 조회
		selectBtn = new Button("Keyword검색");
		selectBtn.setPrefSize(100, 60);
		selectBtn.setOnAction(e -> {
			textarea.clear();

			ArrayList<BookVO> result =
					service.bookSearchByKeyword(input.getText());
			// result를 이용해서 화면에 출력!
			System.out.println("main = "+ result);
			for (BookVO book : result){
				textarea.appendText("제목: "+book.getBtitle()+ "\t 저자: " +book.getBauthor() +"\t"+ "ISBN: "+book.getBisbn() +"\t \n");
			}
		});

		//TODO: 도서 삭제
		input = new TextField();
		input.setPrefSize(40, 60);
		deleteBtn = new Button("ISBN으로 삭제");
		deleteBtn.setPrefSize(100, 60);
		deleteBtn.setOnAction(e -> {
			int result = service.bookDeleteByISBN(textarea.getText());
			if(result > 0) {
				textarea.appendText("삭제 되었습니다");
			}
			textarea.appendText("잘못된 값입니다");
		});

		bottom.setLeft(selectBtn);
		bottom.setCenter(input);
		bottom.setRight(deleteBtn);

		root.setBottom(bottom);

		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("도서검색 및 삭제");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch();
	}
	
}
