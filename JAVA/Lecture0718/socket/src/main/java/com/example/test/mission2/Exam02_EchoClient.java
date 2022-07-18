package com.example.test.mission2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Exam02_EchoClient extends Application {

    TextArea textArea; //텍스트 입력가능한 곳
    Button connBtn; //버튼생성
    TextField idField, textField;

    Socket socket;
    BufferedReader br;
    PrintWriter pr;


    @Override  //추상메소드 오버라딩
    public void start(Stage primaryStage) throws Exception {
        // 화면 구성
        BorderPane root = new BorderPane();
        root.setPrefSize(700,500); //window 크기

        //가운데 글상자
        textArea = new TextArea();
        root.setCenter(textArea); //화면 센터에 textarea 를 붙인다

        connBtn = new Button("echo 서버 접속"); ///접속 버튼 만듬
        connBtn.setPrefSize(150,40); //버튼의 크기
        connBtn.setOnAction(e -> {
                    textArea.clear();
                    try {
                        socket = new Socket("localhost", 5678);
                        br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        pr = new PrintWriter(socket.getOutputStream());
                        textArea.appendText("Echo 서버 접속 성공!!" + "\n");
                    } catch (Exception e2) {

                    }
                });

        //아이디입력
        idField = new TextField();
        idField.setPrefSize(100, 40);

        textField = new TextField();
        textField.setPrefSize(200,40);
        textField.setOnAction(e -> {
            //보낼 문자열 만들기
            String msg = idField.getText() + " : " + textField.getText();
            pr.println(msg);
            pr.flush();

            //텍스트 입력한게 /exit 인지 일반 메세지인지 판단
            if (textField.getText().equals("/exit")){
                textArea.appendText("서버와의 연결을 종료합니다");
                textField.setDisable(true); //disable를 true로 세팅한다 = 사용자 입력이 안되도록 조치
            }else{
                try {
                    String serverMsg = br.readLine();
                    textArea.appendText(serverMsg + "\n");
                }catch (Exception e2){
                }
            }
            textField.clear();
        }); //입력상자에 글 입력 후 enter 입력하면 이벤트 처리가 된다

        FlowPane flowPane = new FlowPane(); //판 하나 만드는것
        flowPane.setPadding(new Insets(10,10,10,10)); //판 위에 여백을 준다
        flowPane.setHgap(10);
        flowPane.getChildren().add(connBtn); //버튼을 붙인다
        flowPane.getChildren().add(idField);
        flowPane.getChildren().add(textField);

        root.setBottom(flowPane); //아래에 플로우팬을 붙인다

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        //스레드 생성하면서 창을 띄운다
        launch();
    }
}

