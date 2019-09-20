package ru.omsu.imit.sem5.abstractfactory.sofas;

import ru.omsu.imit.sem5.abstractfactory.interfaces.Sofa;

/**
 * Все семейства продуктов имеют одни и те же вариации (HiTech/Eco/Lofa).
 *
 * Это вариант дивана для HiTech.
 */
public class HiTechSofa implements Sofa {
    private String style = "Hi-Tech";
    private String tvremote = null;
    private int price = 0;

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
