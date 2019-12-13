package ru.omsu.imit.sem5.structural.bridge;

public class VRHelmet implements Input {
    private Device device;

    public VRHelmet(Device device) {
        this.device = device;
        connect();
    }


    @Override
    public boolean connect() {
        return device.connect("VRHelmet");
    }

    @Override
    public boolean unconnect() {
        return device.unconnect("VRHelmet");
    }
}
