package com.example.test.mission2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Exam02_EchoServer {
    public static void main(String[] args) {
        //서버소켓 선언
        ServerSocket serverSocket = null;
        Socket socket = null;
        PrintWriter pr = null;
        BufferedReader br = null;

        try {
            serverSocket = new ServerSocket(5678);
            System.out.println("Echo Server 기동 - 클라이언트 접속 대기");
            //클라이언트 소켓에 담는다
            socket = serverSocket.accept();  //5678을 가지고 클라이언트를 기다려!(blocking)

            //접속에 성공했어요! printWriter => 조금더 나은형태의 데이터 스트림 - 문자열을 더 쉽게 보낼 수 있다
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pr = new PrintWriter(socket.getOutputStream());

            /**클라이언트가 exit 보내기 전까지 반복해서 읽고 보내는 작업을 제작*/
            String msg = null;
            while(true){
                msg = br.readLine();
                        //문자열비교는 equals
                    //클라이언트가 그만 입력 || 창 강제 종료 시킬 경우
                if (msg.equals("/exit") || (msg == null)){
                    break;
                }
                //제대로 값 도착할 경우 - 데이터를 그대로 보냄
                pr.println(msg);
                pr.flush(); //buffer를 기반으로 했기 때문에 원하는 데이터를 제대로 안보내줄 수 있다
            }
            } catch (IOException e) { //자바의 특정 코드들은 try-catch 가 강제되는 코드들이 있다
            }finally {
                //finally -> try~ 오류가 있던 없던 무조건 수행
                // 사용된 resource 를 해제
            try {
                if (br != null) br.close();
                if (pr != null) pr.close();
                if (socket != null) socket.close();
                if (serverSocket != null) serverSocket.close();
                System.out.println("Echo Server 종료!!");
              } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }
    }

}

