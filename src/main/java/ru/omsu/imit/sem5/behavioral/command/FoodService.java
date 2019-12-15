package ru.omsu.imit.sem5.behavioral.command;

import java.util.HashMap;
import java.util.Map;

public class FoodService {
    private Map<String, Food> foodMap;

    public FoodService() {
        foodMap = new HashMap<>();
        foodMap.putIfAbsent("pizza", new Pizza(25));
        foodMap.putIfAbsent("burger", new Burger(10));
    }

    public void addFood(String type, Food food) {
        foodMap.putIfAbsent(type, food);
    }

    public Food get(String type, int money) {
        if (foodMap.containsKey(type)) {
            Food res = foodMap.get(type);
            if (money >= res.cost) {
                return res;
            }
        }
        return null;
    }
}
