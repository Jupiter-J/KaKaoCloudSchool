package stream.note;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;

// notepad를 만들어보자
//JavaFX를 이용
public class MyNotepad extends Application {

    TextArea textArea;

    @Override
    public void start(Stage primaryStage) throws Exception {
        //화면을구성하는 전체 판
        BorderPane root = new BorderPane();
        //BoarderPane의 가로 세로 길이
        root.setPrefSize(700,500);

        //TextArea 생성
        textArea = new TextArea();


        //Scene 객체를 생성
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("메모장");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
