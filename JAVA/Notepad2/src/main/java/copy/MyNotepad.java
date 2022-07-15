package copy;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;

public class MyNotepad extends Application {
    TextArea textArea;
    Button openBtn, saveBtn;
    File file;

    @Override
    public void start(Stage primaryStage) throws IOException {
        //화면을구성하는 전체 판
        BorderPane root = new BorderPane();
        //BoarderPane의 가로 세로 길이
        root.setPrefSize(700,500);

        //TextArea 생성
        textArea = new TextArea();
        root.setCenter(textArea);

        //버튼을 만든다
        openBtn = new Button("파일 열기");
        openBtn.setPrefSize(150, 40);
                                    //이벤트 핸들러를 만들어야 한다
//        openBtn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println("버튼이 눌렸어요!"); //deligation event model
//            }
//        });
                        /**람다로 변경*/
        openBtn.setOnAction(e -> {
            //오픈할 파일을 찾아서 그 내용을 textArea에 출력한다
            textArea.clear(); //textArea의 내용을 다지운다 새로운 내용을 넣어야 하기 때문
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("오픈할 파일을 선택해 주세요!");
            file = fileChooser.showOpenDialog(primaryStage);


            //오류가 날 여지가 있다
            try {
                //관뚫고 파일로부터 문자열을 읽어올것이다
                FileReader fr = new FileReader(file);
                //위의 관보다 더 좋은 통로로 만든다
                //파일의 내용을 한줄씩 읽을 수 있다
                BufferedReader br = new BufferedReader(fr);
                String line = "";
                while((line= br.readLine()) != null){
                    textArea.appendText(line + "\n");
                }
                br.close();
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (IOException e2){

            }
        });
        saveBtn = new Button("파일저장");
        saveBtn.setPrefSize(150,40);
        //save butn을 눌리면 이벤트를 발생한다
        saveBtn.setOnAction(e ->{
            String text = textArea.getText();
            try {
                FileWriter fw = new FileWriter(file);
                   //내가 갖고온 text를 저장
                fw.write(text);
                    //저장후 닫기
                fw.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });



        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(10,10,10,10));
        flowPane.setColumnHalignment(HPos.CENTER);
        flowPane.setPrefSize(700,40);
        flowPane.setHgap(10); // 간격

        //flowPane에 버튼을 붙인다
        flowPane.getChildren().add(openBtn);
        flowPane.getChildren().add(saveBtn);

        root.setBottom(flowPane);

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