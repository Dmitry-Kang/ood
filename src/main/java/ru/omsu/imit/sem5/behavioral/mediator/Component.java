package ru.omsu.imit.sem5.behavioral.mediator;

import java.util.List;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
    List<Item> getItems();
    int getCash();
    void setCash(int cash);
    void sellItem(Item item);
    void buyItem(String itemName);
}
