package ru.omsu.imit.sem5.abstractfactory.beds;

import ru.omsu.imit.sem5.abstractfactory.interfaces.Bed;

/**
 * Все семейства продуктов имеют одни и те же вариации (HiTech/Eco/Lofa).
 *
 * Это вариант кровати для Eco.
 */
public class EcoBed implements Bed {
    private String style = "Eco";
    private String matress = "Eco matress";
    private int price = 2;

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

