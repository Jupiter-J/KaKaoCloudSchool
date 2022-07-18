package com.example.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Exam01_DateServer {

    public static void main(String[] args) {

        try {                             //뒤쪽에 임의로 내가 포트번호를 적어준다
            ServerSocket serverSocket = new ServerSocket(5678);
            System.out.println("Date Server 기동 - 5678");
            //클라이언트 소켓에 담는다
            Socket socket = serverSocket.accept();  //5678을 가지고 클라이언트를 기다려!(blocking)

            //접속에 성공했어요! printWriter => 조금더 나은형태의 데이터 스트림 - 문자열을 더 쉽게 보낼 수 있다
            PrintWriter pr = new PrintWriter(socket.getOutputStream());
            //현재 날짜를 구한다
            Date date = new Date();
            //만들어진 스트림으로 데이터를 보낸다
            pr.println(date.toString());
            /**
             버퍼에 들어가 있는 데이터를 스트림을 통해 내보내는 시점은
             1. 스트림이 강제로 종료될 경우
             2. 버퍼의 공간이 다 찰 경우
             3. method 를 이용해서 flush() 시킬 경우 -> 가능하면 3번으로 사용하기
             **/

            //역순으로 사용한 리소스 닫기
           // pr.close(); 보다 plush 사용하기
            pr.flush();
            socket.close();
            serverSocket.close();
            System.out.println("Date Server 종료");
        } catch (IOException e) { //자바의 특정 코드들은 try-catch 가 강제되는 코드들이 있다
        }
    }

}
