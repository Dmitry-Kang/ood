package ru.omsu.imit.sem5.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Human implements Component {
    private Mediator mediator;
    private String name;
    private List<Item> items;
    private int cash;

    public Human(Mediator mediator, String name, int cash) {
        this.mediator = mediator;
        this.name = name;
        this.cash = cash;
        items = new ArrayList<>();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Item> getItems() {
        return items;
    }

    @Override
    public int getCash() {
        return cash;
    }

    @Override
    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public void sellItem(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                Item itemm = items.remove(i);
                mediator.sellItem(item, this);
            }
        }

    }

    @Override
    public void buyItem(String itemName) {
        mediator.buyItem(itemName,this);
    }


}
