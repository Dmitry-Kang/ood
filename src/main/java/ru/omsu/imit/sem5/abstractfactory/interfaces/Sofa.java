package ru.omsu.imit.sem5.abstractfactory.interfaces;

/**
 * Диваны — это третье семейство продуктов. Оно имеет другие вариации, в отличие от других двух
 */
public interface Sofa {
    String getStyle();
    String getTVRemote();
    int getPrice();
    void setPrice(int price);
    void setTVRemote(String tvremote);
}
