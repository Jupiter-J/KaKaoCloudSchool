package com.example.lecture0722.step2_2;

import java.sql.SQLException;

public class UserMain {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //UserDAO를 사용하면서 데이터베이스를 연결하는 NUserDAO만 변경하여 사용가능해졌다
        //추상클래스는 인스턴스 생성이 불가능 상위클래스 내용에 + 하위클래스가 내용을 추가해서 사용
        //클래스를 재사용하는 방법
        UserDAO dao = new NUserDAO();
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
