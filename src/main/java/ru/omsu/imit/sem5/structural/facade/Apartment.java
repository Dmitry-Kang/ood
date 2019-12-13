package ru.omsu.imit.sem5.structural.facade;

import java.util.ArrayList;
import java.util.List;

public class Apartment {
    private List<Room> rooms;
    private List<Device> devices;

    public Apartment() {
        rooms = new ArrayList<>();
        devices = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Device> getDevices() {
        return devices;
    }
}
