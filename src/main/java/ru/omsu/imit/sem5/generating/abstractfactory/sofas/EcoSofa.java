package ru.omsu.imit.sem5.generating.abstractfactory.sofas;

import ru.omsu.imit.sem5.generating.abstractfactory.interfaces.Sofa;

/**
 * Все семейства продуктов имеют одни и те же вариации (HiTech/Eco/Lofa).
 *
 * Это вариант дивана для Eco.
 */
public class EcoSofa implements Sofa {
    private String style = "Eco";
    private String tvremote = "EcoTv";
    private int price = 10;

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
