package ru.omsu.imit.sem5.behavioral.chainofresponsibility;

public class AngerAndLaziness extends CircleOfHell {

    @Override
    public void printMessage(String name) {
        System.out.println("Грешник " + name + " прибыл на пятый круг - " +
                "Гнев и Лень и дрался по горло в болоте с согрешниками");
    }
}
