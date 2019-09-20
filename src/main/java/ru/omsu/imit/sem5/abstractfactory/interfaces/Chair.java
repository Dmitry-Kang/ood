package ru.omsu.imit.sem5.abstractfactory.interfaces;

/**
 * Стулья — это второе семейство продуктов. Оно имеет другие вариации, в отличие от кроватей
 */
public interface Chair {
    String getStyle();
    int getPillows();
    int getPrice();
    void setPrice(int price);
    void setPillows(int pillows);
}
