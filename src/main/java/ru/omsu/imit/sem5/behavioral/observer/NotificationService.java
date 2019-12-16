package ru.omsu.imit.sem5.behavioral.observer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NotificationService {
    private Map<Observer, Set<String>> map;

    public NotificationService() {
        map = new HashMap<>();
    }

    public void added(String good) {
        for (Map.Entry<Observer, Set<String>> entry :map.entrySet()) {
            Set<String> set = entry.getValue();
            if (set.contains(good)) {
                entry.getKey().update("Товар " + good + " появился на рынке. Скорей забери его");
            }
        }
    }

    public void subscribe(String good, Observer observer) {
        if (map.containsKey(observer)) {
            map.get(observer).add(good);
        } else {
            Set<String> set = new HashSet<>();
            set.add(good);
            map.put(observer, set);
        }
    }
}
