package stream;

import java.io.*;

public class KeyboardInput {
    public static void main(String[] args) {
        System.out.println("키보드로 한줄을 입력하세요");

        //키보드(표준입력 System-in)를 통해 데이터를 한줄 입력받는다
        //이 System.in 이라는 제공된 Stream은 사용하기 너무 힘들다
        InputStreamReader isr = new InputStreamReader(System.in);

        //buffer
        BufferedReader br = new BufferedReader(isr);
        // read는 try-catch 가 강제됨
        try {
            String input = br.readLine();
            System.out.println("입력받은 문자열은: " + input);
        } catch (IOException e) {

        }
    }
}
