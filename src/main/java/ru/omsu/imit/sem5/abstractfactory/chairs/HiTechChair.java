package ru.omsu.imit.sem5.abstractfactory.chairs;

import ru.omsu.imit.sem5.abstractfactory.interfaces.Chair;

/**
 * Все семейства продуктов имеют одни и те же вариации (HiTech/Eco/Lofa).
 *
 * Это вариант стула для HiTech.
 */
public class HiTechChair implements Chair {
    private String style = "Hi-Tech";
    private int pillows = 0;
    private int price = 0;

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
