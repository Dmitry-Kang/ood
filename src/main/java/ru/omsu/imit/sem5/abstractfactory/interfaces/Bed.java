package ru.omsu.imit.sem5.abstractfactory.interfaces;

/**
 * Паттерн предполагает, что у вас есть несколько семейств продуктов,
 * находящихся в отдельных иерархиях классов (Bed/Chair/Sofa). Продукты одного
 * семейства должны иметь общий интерфейс.
 *
 * Это — общий интерфейс для семейства продуктов Bed.
 */
public interface Bed {
    String getStyle();
    String getMattress();
    int getPrice();
    void setPrice(int price);
    void setMattress(String mattress);
}
