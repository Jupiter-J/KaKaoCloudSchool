package com.example.lecture0722.crud;

import java.sql.SQLException;
import java.util.List;

public class UserService {
    private UserDAO userDAO;


    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;

    }

    public void userUpdate(User user) throws SQLException, ClassNotFoundException {
        userDAO.insert(user);
    }

    public List<User> userSearch(String name) throws SQLException, ClassNotFoundException {
        return userDAO.select(name);
    }



}
