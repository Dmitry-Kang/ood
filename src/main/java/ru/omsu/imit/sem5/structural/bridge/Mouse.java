package ru.omsu.imit.sem5.structural.bridge;

public class Mouse implements Input {
    private Device device;

    Mouse(Device device) {
        this.device = device;
        connect();
    }

    @Override
    public boolean connect() {
        return device.connect("Mouse");
    }

    @Override
    public boolean unconnect() {
        return device.unconnect("Mouse");
    }

    public void setCursor(int x, int y) {
        device.setCursor(x, y);
    }

    public void setCursor(VectorXY vec) {
        setCursor(vec.getX(), vec.getY());
    }
}
