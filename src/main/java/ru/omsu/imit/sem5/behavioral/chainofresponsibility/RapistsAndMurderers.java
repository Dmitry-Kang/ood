package ru.omsu.imit.sem5.behavioral.chainofresponsibility;

public class RapistsAndMurderers extends CircleOfHell {
    @Override
    public void printMessage(String name) {
        System.out.println("Грешник " + name + " прибыл на седьмой круг - " +
                "Для насильников и убийц всех мастей и ему было суждено кипеть в кровавой реке");
    }
}
