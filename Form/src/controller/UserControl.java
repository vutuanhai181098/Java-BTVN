package controller;

import model.User;

import java.util.ArrayList;

public class UserControl {
    public User checkUsername(ArrayList<User> users, String username){
        for (User user: users
             ) {
            if(user.getUsername().equals(username)) return user;
        }
        return null;
    }
    public User checkPassword(User user, String password){
        if(user.getPassword().equals(password)) return user;
        return null;
    }
    public User checkEmail(User user, String email){
        if (user.getEmail().equals(email)) return user;
        return null;
    }
}
