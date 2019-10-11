package ru.omsu.imit.sem5.generating.abstractfactory.chairs;

import ru.omsu.imit.sem5.generating.abstractfactory.interfaces.Chair;

/**
 * Все семейства продуктов имеют одни и те же вариации (HiTech/Eco/Lofa).
 *
 * Это вариант стула для Lofa.
 */
public class LofaChair implements Chair {
    private String style = "Lofa";
    private int pillows = 2;
    private int price = 3;

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
