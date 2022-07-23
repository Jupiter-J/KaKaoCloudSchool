package com.example.lecture0722.step4;

import java.sql.SQLException;

public class UserMain {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //todo: change
        UserDAO dao = new UserDAO();
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
