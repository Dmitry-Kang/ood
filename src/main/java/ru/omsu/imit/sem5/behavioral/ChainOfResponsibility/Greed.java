package ru.omsu.imit.sem5.behavioral.ChainOfResponsibility;

public class Greed extends CircleOfHell {
    @Override
    public void printMessage(String name) {
        System.out.println("Грешник " + name + " прибыл на четвёртый круг - " +
                "Жадность и протаскал тяжелый груз, врезаясь и бесконечно споря с согрешниками");
    }
}
