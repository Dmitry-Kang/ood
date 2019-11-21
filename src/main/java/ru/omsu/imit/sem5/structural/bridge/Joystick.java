package ru.omsu.imit.sem5.structural.bridge;

public class Joystick implements Input {
    private Device device;

    Joystick(Device device) {
        this.device = device;
        connect();
    }


    @Override
    public boolean connect() {
        return device.connect("Joystick");
    }

    @Override
    public boolean unconnect() {
        return device.unconnect("Joystick");
    }
}
