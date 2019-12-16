package ru.omsu.imit.sem5.behavioral.chainofresponsibility;

public class Salacity extends CircleOfHell {
    @Override
    public void printMessage(String name) {
        System.out.println("Грешник " + name + " прибыл на второй круг - Сладострастие и прошёл истязание бурей");
    }
}
