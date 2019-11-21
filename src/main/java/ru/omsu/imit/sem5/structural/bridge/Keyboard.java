package ru.omsu.imit.sem5.structural.bridge;

public class Keyboard implements Input {
    private Device device;

    Keyboard(Device device) {
        this.device = device;
        connect();
    }


    @Override
    public boolean connect() {
        return device.connect("Keyboard");
    }

    @Override
    public boolean unconnect() {
        return device.unconnect("Keyboard");
    }
}
