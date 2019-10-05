package ru.omsu.imit.sem5.builder.classes;

public class Cook
{
    public void makeHedgehogSalad(Plate plate) {
        plate.setSausage(100);
        plate.setCheese(100);
        plate.setEggs(3);
        plate.setCorn(140);
        plate.setGarlic(1);
        plate.setMayonnaise(80);
    }

    public void makeMushroomChickenSalad(Plate plate) {
        plate.setChickenBreast(1);
        plate.setEggs(2);
        plate.setCheese(100);
        plate.setMushrooms(150);
        plate.setOnion(2);
        plate.setSunFlowerOil(20);
        plate.setMayonnaise(50);
        plate.setSalt(20);
    }

    public void makeRainbowSalad(Plate plate) {
        plate.setSausage(300);
        plate.setRedPepper(200);
        plate.setCucumber(200);
        plate.setCorn(200);
        plate.setOnion(70);
        plate.setEggs(3);
        plate.setMayonnaise(100);
        plate.setMustard(2);
        plate.setBlackPepper(50);
        plate.setSalt(20);
    }
}
