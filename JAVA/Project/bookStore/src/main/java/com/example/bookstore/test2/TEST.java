package com.example.bookstore;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

//창을 띄우기 위해서 Application 상속
public class TEST extends Application {

    TextArea textArea; //텍스트 입력가능한 곳
    Button connBtn; //버튼생성

    @Override  //추상메소드 오버라딩
    public void start(Stage primaryStage) throws Exception {
        // 화면 구성
        BorderPane root = new BorderPane();
        root.setPrefSize(700,500); //window 크기

        textArea = new TextArea();
        root.setCenter(textArea); //화면 센터에 textarea 를 붙인다

        connBtn = new Button("Date 서버 접속"); ///접속 버튼 만듬
        connBtn.setPrefSize(150,40);
        connBtn.setOnAction(e ->{
            textArea.clear();
        });
        connBtn.setOnAction(null);

        FlowPane flowPane = new FlowPane(); //판 하나 만드는것
        flowPane.setPadding(new Insets(10,10,10,10)); //판 위에 여백을 준다
        flowPane.setPrefSize(700,400);
        flowPane.setHgap(10);
        flowPane.getChildren().add(connBtn); //버튼을 붙인다

        root.setBottom(textArea); //아래에 플로우팬을 붙인다

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        //스레드 생성하면서 창을 띄운다
        launch();
    }
}