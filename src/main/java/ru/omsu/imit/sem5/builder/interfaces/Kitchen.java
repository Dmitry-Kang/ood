package ru.omsu.imit.sem5.builder.interfaces;

public interface Kitchen {
    void reset();
    void setSausage(int val); // колбаса в граммах
    void setCheese(int val); // сыр в граммах
    void setEggs(int val); // яйца в штуках
    void setCorn(int val); // кукуруза в граммах, только зёрна
    void setGarlic(int val); // чеснок в штуках, в зубчиках
    void setMayonnaise(int val); // майонез, в граммах
    void setChickenBreast(int val); // куриная грудка, в штуках
    void setMushrooms(int val); // грибы, в граммах
    void setOnion(int val); // лук репчатый, в граммах
    void setSunFlowerOil(int val); // подсолнечное масло, в граммах
    void setSalt(int val); // соль мелкая, в граммах
    void setRedPepper(int val); // перец красный, в граммах
    void setBlackPepper(int val); // перец чёрный, в граммах
    void setCucumber(int val); // огурец свежий, в граммах
    void setMustard(int val); // горчица, в столовых ложках

}
