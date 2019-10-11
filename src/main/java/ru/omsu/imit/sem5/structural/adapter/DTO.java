package ru.omsu.imit.sem5.structural.adapter;

public class DTO {
    public boolean registerUser(String nickName, int age, String email, String password) {
        return Base.getBase().registerUser(new User(nickName, age, email, password));
    }

    public boolean loginUser(String nickName, int age, String email, String password) {
        return Base.getBase().loginUser(new User(nickName, age, email, password));
    }

    public boolean logoutUser(String nickName, int age, String email, String password) {
        return Base.getBase().logoutUser(new User(nickName, age, email, password));
    }
}
