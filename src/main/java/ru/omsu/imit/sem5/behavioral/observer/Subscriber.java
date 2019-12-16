package ru.omsu.imit.sem5.behavioral.observer;

public class Subscriber implements Observer {
    public String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String string) {
        System.out.println(string);
    }
}
