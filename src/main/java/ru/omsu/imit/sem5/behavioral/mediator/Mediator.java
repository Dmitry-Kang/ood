package ru.omsu.imit.sem5.behavioral.mediator;


public interface Mediator {
    void sellItem(Item item, Component component);
    void buyItem(String itemName, Component component);
}
