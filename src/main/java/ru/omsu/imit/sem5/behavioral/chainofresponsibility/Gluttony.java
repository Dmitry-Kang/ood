package ru.omsu.imit.sem5.behavioral.chainofresponsibility;

public class Gluttony extends CircleOfHell {
    @Override
    public void printMessage(String name) {
        System.out.println("Грешник " + name + " прибыл на третий круг - Чревоугодие и прогнил под солнцем и дождем");
    }
}
