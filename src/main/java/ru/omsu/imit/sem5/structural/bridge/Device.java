package ru.omsu.imit.sem5.structural.bridge;

public interface Device {

    boolean isOn(); // проверяет, включен ли пк
    boolean powerOn(); // включает пк
    boolean powerOff(); // выключает пк

    boolean connect(String deviceName); // подключает устройство - сопряжение
    boolean unconnect(String deviceName); // отключает устройство

    void setCursor(int x, int y); // направляет курсор на координаты (x, y)
    void setCursor(VectorXY vec); // направляет курсор на координаты (vec.x, vec.y)

    int getCursorX(); // возвращает координаты курсора по x
    int getCursorY(); // возвращает координаты курсора по y
    VectorXY getCurVector(); // возвращает координаты курсора по вектору

    void play(String appName); // запускает данное приложение
}
