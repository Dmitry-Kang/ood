package ru.omsu.imit.sem5.behavioral.ChainOfResponsibility;

public abstract class CircleOfHell {
    CircleOfHell nextCircleOfHell;

    public void setNextCircleOfHell(CircleOfHell nextCircleOfHell) {
        this.nextCircleOfHell = nextCircleOfHell;
    }

    public void goThrough(Sinner sinner){
        printMessage(sinner.name);
        if(nextCircleOfHell != null){
            nextCircleOfHell.goThrough(sinner);
        }
    }
    public abstract void printMessage(String name);
}
