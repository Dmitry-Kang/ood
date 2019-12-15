package ru.omsu.imit.sem5.behavioral.command;

public class OrderCommand extends Command {

    public OrderCommand(TableWithButtons tableWithButtons, int cost) {
        super(tableWithButtons, cost);
    }

    @Override
    public boolean execute(String type) {
        if (tableWithButtons.cash - cost >= 0) {
            tableWithButtons.cash -= cost;
            tableWithButtons.foods.add(tableWithButtons.foodService.get(type, cost));
            return true;
        }
        return false;
    }
}
