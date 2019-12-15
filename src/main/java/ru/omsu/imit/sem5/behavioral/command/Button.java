package ru.omsu.imit.sem5.behavioral.command;

public class Button {
    String type; // тип кнопки
    int cost; // стоимость кнопки
    Command command;

    public Button(String type, int cost, Command command) {
        this.type = type;
        this.cost = cost;
        this.command = command;
    }

    public boolean execute() {
        return command.execute();
    }

    public String getType() {
        return type;
    }

    public int getCost() {
        return cost;
    }
}
