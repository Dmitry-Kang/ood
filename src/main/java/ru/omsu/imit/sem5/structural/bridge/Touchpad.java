package ru.omsu.imit.sem5.structural.bridge;

public class Touchpad implements Input {
    private Device device;

    Touchpad(Device device) {
        this.device = device;
        connect();
    }


    @Override
    public boolean connect() {
        return device.connect("Touchpad");
    }

    @Override
    public boolean unconnect() {
        return device.unconnect("Touchpad");
    }

    public void run(String taskGame) {
        device.play(taskGame);
    }
}
