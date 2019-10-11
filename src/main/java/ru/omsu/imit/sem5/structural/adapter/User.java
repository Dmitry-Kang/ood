package ru.omsu.imit.sem5.structural.adapter;

import java.util.Objects;

public class User {
    private String NickName;
    private int age;
    private String email;
    private String password;

    public User(String nickName, int age, String email, String password) {
        NickName = nickName;
        this.age = age;
        this.email = email;
        this.password = password;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getAge() == user.getAge() &&
                Objects.equals(getNickName(), user.getNickName()) &&
                Objects.equals(getEmail(), user.getEmail()) &&
                Objects.equals(getPassword(), user.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNickName(), getAge(), getEmail(), getPassword());
    }
}
