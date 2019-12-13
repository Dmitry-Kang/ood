package ru.omsu.imit.sem5.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class extender extends Device {
    private List<Device> devices;
    private boolean isOn;

    public extender(Device... devices) {
        super();
        this.devices = new ArrayList(Arrays.asList(devices));
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getWatt() {
        if (isOn) {
            return findWatt();
        }
        return 0;
    }

    // Новые методы

    public void addDevice(Device... device) {
        devices.addAll(Arrays.asList(device));
    }

    public void delDevice(Device... device) {
        devices.removeAll(Arrays.asList(device));
    }

    private int findWatt() { // определяет, сколько ватт он потребляет
        int sum = 0;
        for (Device a: devices) {
            sum += a.getWatt();
        }
        return sum;
    }
}
