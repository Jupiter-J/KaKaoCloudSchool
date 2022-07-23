package com.example.lecture0722.step1;

import java.sql.SQLException;

public class UserMain {
                                                //try-catch를 안씀
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //todo: 서비스 없이 메인에서 직접 로직 처리한다

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
