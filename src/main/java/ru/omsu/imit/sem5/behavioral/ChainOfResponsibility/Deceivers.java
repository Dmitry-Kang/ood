package ru.omsu.imit.sem5.behavioral.ChainOfResponsibility;

public class Deceivers extends CircleOfHell {
    @Override
    public void printMessage(String name) {
        System.out.println("Грешник " + name + " прибыл на восьмой круг - " +
                "Для обманщиков и ему было суждено кипеть в смоле");
    }
}
