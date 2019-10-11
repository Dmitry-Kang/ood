package ru.omsu.imit.sem5.generating.builder.classes;

import ru.omsu.imit.sem5.generating.builder.interfaces.Kitchen;

public class Plate implements Kitchen {
    Salad result = new Salad();

    public void reset() {
        result = new Salad();
    }

    public void setSausage(int val) {
        result.setSausage(val);
    }

    public void setCheese(int val) {
        result.setCheese(val);
    }

    public void setEggs(int val) {
        result.setEggs(val);
    }

    public void setCorn(int val) {
        result.setCorn(val);
    }

    public void setGarlic(int val) {
        result.setGarlic(val);
    }

    public void setMayonnaise(int val) {
        result.setMayonnaise(val);
    }

    public void setChickenBreast(int val) {
        result.setChickenBreast(val);
    }

    public void setMushrooms(int val) {
        result.setMushrooms(val);
    }

    public void setOnion(int val) {
        result.setOnion(val);
    }

    public void setSunFlowerOil(int val) {
        result.setSunFlowerOil(val);
    }

    public void setSalt(int val) {
        result.setSalt(val);
    }

    public void setRedPepper(int val) {
        result.setRedPepper(val);
    }

    public void setBlackPepper(int val) {
        result.setBlackPepper(val);
    }

    public void setCucumber(int val) {
        result.setCucumber(val);
    }

    public void setMustard(int val) {
        result.setMustard(val);
    }

    public Salad getResult() {
        return result;
    }
}
