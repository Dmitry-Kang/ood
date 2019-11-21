package ru.omsu.imit.sem5.structural.bridge;

public class PCCase implements Input {
    private Device device;

    PCCase(Device device) {
        this.device = device;
        connect();
    }

    public boolean powerOn() {
        return device.powerOn();
    }

    public boolean powerOff() {
        return device.powerOff();
    }

    @Override
    public boolean connect() {
        return device.connect("PCCase");
    }

    @Override
    public boolean unconnect() {
        return device.unconnect("PCCase");
    }
}
