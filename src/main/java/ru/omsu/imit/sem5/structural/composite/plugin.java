package ru.omsu.imit.sem5.structural.composite;

public interface plugin {
    void turnOn(); // включает устройство
    void turnOff(); // выключает устройство
    int getWatt(); // возвращает сумму ватт, которое потребляет устройство
}
