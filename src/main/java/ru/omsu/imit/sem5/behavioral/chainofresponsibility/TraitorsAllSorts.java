package ru.omsu.imit.sem5.behavioral.chainofresponsibility;

public class TraitorsAllSorts extends CircleOfHell {
    @Override
    public void printMessage(String name) {
        System.out.println("Грешник " + name + " прибыл на девятый круг - " +
                "Для предателей и ему были суждены вечные терзания в ледяном озере");
    }
}
