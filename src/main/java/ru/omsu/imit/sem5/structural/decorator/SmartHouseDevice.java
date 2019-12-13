package ru.omsu.imit.sem5.structural.decorator;

public class SmartHouseDevice implements SmartHouse {
    private SmartHouse smartHouse;

    SmartHouseDevice(SmartHouse source) {
        this.smartHouse = source;
    }

    @Override
    public void work() {
        smartHouse.work();
    }
}
