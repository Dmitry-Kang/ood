package ru.omsu.imit.sem5.abstractfactory.chairs;

import ru.omsu.imit.sem5.abstractfactory.interfaces.Chair;

/**
 * Все семейства продуктов имеют одни и те же вариации (HiTech/Eco/Lofa).
 *
 * Это вариант стула для Eco.
 */
public class EcoChair implements Chair {
    private String style = "Eco";
    private int pillows = 1;
    private int price = 2;

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPillows(int pillows) {
        this.pillows = pillows;
    }
}
