package com.example.lecture0722.crud;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        /**DI*/
        ConnectionMaker connectionMaker = new NUserDAO();
        UserDAO userDAO = new UserDAO(connectionMaker);
        UserService userService = new UserService(userDAO);

        User user = new User();
        user.setName("고양이는 체고다 하하");
        user.setPassword("고양이");
        userService.userUpdate(user);


        System.out.println("새로운 유저 등록");
        System.out.println(user.getName() + ", " + user.getPassword());
        System.out.println("----------------------");

        List<User> result = userService.userSearch("고양이");
        int i=0;
        for (User searchName : result){
            i++;
            System.out.println(  "검색결과"+ i + ": \t"+ searchName.getName() +" 찾음");
        }

    }
}
