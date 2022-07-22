package com.example.lecture0722.step5;

import com.example.lecture0722.step5.ConnectionMaker;

import java.sql.SQLException;

public class UserMain {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //todo: connection을 얻어오는 인터페이스 객체를 넣어줘야 한다
        /**내가 판매한 인터페이스 객체에 자기가 구현한 놈을 넣어주기만 하면 된다
         클래스간의 의존성은 없지만 코드가 실행될때 객체끼리의 의존성은 존재하게됨
         (인스턴스 의존성 & 객체 의존성이라고 한다) 한 객체에 다른 객체를 밀어 넣어주는것 DI
         의존성을 내가 강제로 주입해서 만들어 주는 것

         그래서 상속기반이 아닌 인터페이스 구현 기반으로 가게된다! 클래스간의 의존성을 낮추기 위해서
         */
        ConnectionMaker connectionMaker = new NUserDAO();

        UserDAO dao = new UserDAO(connectionMaker);
        User user = new User();
        user.setId("1");
        user.setName("홍길동");
        user.setPassword("test1234");

        dao.insert(user);
        System.out.println("새로운 사용자 등록");
        User user2 = dao.select("1");
        System.out.println(user2.getName() + " ,"+ user2.getPassword());
    }
}
