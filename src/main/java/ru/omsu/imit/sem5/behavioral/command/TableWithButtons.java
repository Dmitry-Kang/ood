package ru.omsu.imit.sem5.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class TableWithButtons {
    private boolean isButtonsOn;
    public int cash;
    public List<Button> buttons;
    public FoodService foodService;
    public List<Food> foods;

    public TableWithButtons(int cash) {
        isButtonsOn = true;
        this.cash = cash;
        buttons = new ArrayList<>();
        foodService = new FoodService();
        foods = new ArrayList<>();
    }

    public void powerOn() {
        isButtonsOn = true;
    }

    public void powerOff() {
        isButtonsOn = false;
    }

    public void addButton(Button button) {
        if (isButtonsOn) {
            buttons.add(button);
        }
    }

    public boolean pressButton(String buttonType) {
        for (Button button: buttons) {
            if (button.type == buttonType) {
                return executeCommand(button.command, button.type);
//                return button.execute();
            }
        }
        System.out.println("Кнопка не найдена");
        return false;
    }

    private boolean executeCommand(Command command, String type) {
        if (isButtonsOn) {
            return command.execute(type);
        }
        return false;
    }

}
