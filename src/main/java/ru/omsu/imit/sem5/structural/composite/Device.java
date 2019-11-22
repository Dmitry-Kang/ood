package ru.omsu.imit.sem5.structural.composite;

public class Device implements plugin {
    private int watt;

    Device() {
        turnOff();
    }

    @Override
    public void turnOn() {
        watt = 25;
    }

    @Override
    public void turnOff() {
        watt = 0;
    }

    @Override
    public int getWatt() {
        return watt;
    }

    public void setVatt(int val) {
        this.watt = val;
    }
}
