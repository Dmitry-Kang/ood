package ru.omsu.imit.sem5.behavioral.observer;

import java.util.*;

public class Mart {
    private NotificationService service;
    private List<String> goods;

    public Mart() {
        service = new NotificationService();
        goods = new ArrayList<>();
    }

    public void addGood(String good) {
        goods.add(good);
        service.added(good);
    }

    public void subscribe(String good, Observer observer) {
        service.subscribe(good, observer);
    }
}
