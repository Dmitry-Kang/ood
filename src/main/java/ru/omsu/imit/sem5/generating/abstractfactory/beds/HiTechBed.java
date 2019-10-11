package ru.omsu.imit.sem5.generating.abstractfactory.beds;

import ru.omsu.imit.sem5.generating.abstractfactory.interfaces.Bed;

/**
 * Все семейства продуктов имеют одни и те же вариации (HiTech/Eco/Lofa).
 *
 * Это вариант кровати для HiTech.
 */
public class HiTechBed implements Bed {
    private String style = "Hi-Tech";
    private String matress = "Steel matress";
    private int price = 0;

    public String getStyle() {
        return style;
    }

    public String getMattress() {
        return matress;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMattress(String mattress) {
        this.matress = mattress;
    }
}
