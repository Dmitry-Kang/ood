package ru.omsu.imit.sem5.behavioral.ChainOfResponsibility;

public class Limbo extends CircleOfHell {
    @Override
    public void printMessage(String name) {
        System.out.println("Грешник " + name + " прибыл на первый круг - Лимб и безбольно скорбил");
    }
}
