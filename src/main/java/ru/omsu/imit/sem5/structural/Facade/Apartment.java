package ru.omsu.imit.sem5.structural.Facade;

import ru.omsu.imit.sem5.structural.bridge.Device; // TODO убрать

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Apartment {
    private List<Room> rooms;
    private List<Device> devices;

    Apartment() {
        rooms = new ArrayList<>();
        devices = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public Room[] getRooms() {
        return rooms.toArray(rooms);
    }

    public Device[] getDevices() {
        return devices.toArray(devices);
    }
}
