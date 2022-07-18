package com.example.test.mission1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//창을 띄우기 위해서 Application 상속
public class Exam01_DateClient extends Application {

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
            try {
                //서버 process 에 접속을 시도 (ip, port에 접속할겁니다!)
                Socket socket = new Socket("localhost",5678);
                //접속에 성공했으니 이제 stream을 열자
                InputStreamReader ir = new InputStreamReader(socket.getInputStream());
                //스트림을 결합하여 가장 사용하기 편한 형태로 변신
                BufferedReader br = new BufferedReader(ir);

                String msg = br.readLine(); //blocking 메소드이다 - 읽을수 있는게 들어올때까지 대기 (서버가 보내주지 않으면)
                textArea.appendText(msg + "\n"); //받은 메세지를 화면에 붙여준다

                br.close();
                ir.close();
                socket.close();
                textArea.appendText("서버와의 연결이 종료되었습니다");

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        FlowPane flowPane = new FlowPane(); //판 하나 만드는것
        flowPane.setPadding(new Insets(10,10,10,10)); //판 위에 여백을 준다
        flowPane.setHgap(10);
        flowPane.getChildren().add(connBtn); //버튼을 붙인다

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
