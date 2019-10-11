package ru.omsu.imit.sem5.structural.adapter;


import java.util.HashSet;
import java.util.Set;

public final class Base {
    private static Base myBase;
    private Set<User> baseUsers;
    private Set<User> onlineUsers;

    private Base() {
        baseUsers = new HashSet<>();
        onlineUsers = new HashSet<>();
    }

    public static Base getBase() {
        if (myBase == null) {
            myBase = new Base();
        }
        return myBase;
    }

    public boolean registerUser(User user) {
        if (!baseUsers.contains(user)) {
            baseUsers.add(user);
            onlineUsers.add(user);
            return true;
        }
        return false;
    }

    public boolean loginUser(User user) {
        if (!onlineUsers.contains(user) && baseUsers.contains(user)) {
            onlineUsers.add(user);
            return true;
        }
        return false;
    }

    public boolean logoutUser(User user) {
        if (onlineUsers.contains(user)) {
            onlineUsers.remove(user);
            return true;
        }
        return false;
    }


}
