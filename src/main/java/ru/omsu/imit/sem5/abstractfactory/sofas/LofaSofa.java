package ru.omsu.imit.sem5.abstractfactory.sofas;

import ru.omsu.imit.sem5.abstractfactory.interfaces.Sofa;

/**
 * Все семейства продуктов имеют одни и те же вариации (HiTech/Eco/Lofa).
 *
 * Это вариант дивана для Lofa.
 */
public class LofaSofa implements Sofa {
    private String style = "Lofa";
    private String tvremote = "LG";
    private int price = 5;

    public String getStyle() {
        return style;
    }

    public String getTVRemote() {
        return tvremote;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setTVRemote(String tvremote) {
        this.tvremote = tvremote;
    }
}
