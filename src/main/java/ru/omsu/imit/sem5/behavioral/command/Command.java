package ru.omsu.imit.sem5.behavioral.command;

public abstract class Command {
    public TableWithButtons tableWithButtons;
    private int cost;

    Command(TableWithButtons tableWithButtons, int cost) {
        this.tableWithButtons = tableWithButtons;
        this.cost = cost;
    }

    public abstract boolean execute();
}
