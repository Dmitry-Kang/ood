package ru.omsu.imit.sem5.behavioral.mediator;

import java.util.*;

public class Amazon implements Mediator {
    private Map<Component, List<Item>> shop; // компонент-что продаёт

    public Amazon() {
        shop = new HashMap<>();
    }

    public void sellItem(Item item, Component component) {
        component.setMediator(this);
        if (shop.containsKey(component)) {
            shop.get(component).add(item);
        } else {
            List<Item> list = new ArrayList<>();
            list.add(item);
            shop.put(component, list);
        }
    }

    public void buyItem(String itemName, Component component) {
        component.setMediator(this);
        for (Map.Entry<Component,List<Item>> entry: shop.entrySet()) {
            List<Item> list = entry.getValue();
            for(int i = 0; i < list.size(); i++) {
                Item item = list.get(i);
                if (item.getName().equals(itemName)) {
                    if (component.getCash() - item.getCost() >= 0) {
                        component.setCash(component.getCash() - item.getCost());
                        entry.getKey().setCash(entry.getKey().getCash() + item.getCost());
                        component.getItems().add(entry.getValue().remove(i));
                    }
                }
            }
        }
    }
}
