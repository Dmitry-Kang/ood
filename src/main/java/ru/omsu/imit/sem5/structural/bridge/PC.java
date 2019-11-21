package ru.omsu.imit.sem5.structural.bridge;

import java.util.HashSet;
import java.util.Set;

public class PC implements Device {
    private boolean isOn;
    private Set<String> set;
    private VectorXY vector;


    PC() {
        isOn = false;
        set = new HashSet<>();
        vector = new VectorXY(0, 0);
    }

    /*
     * Возвращает true, если комп включен
     * false, если комп выключен
     */
    @Override
    public boolean isOn() {
        return isOn;
    }

    /*
     * Возвращает true, если комп был выключен
     * false - иначе
     */
    @Override
    public boolean powerOn() {
        if (!isOn) {
            isOn = true;
            return true;
        }
        return false;
    }

    /*
     * Возвращает true, если комп был включен
     * false - иначе
     */
    @Override
    public boolean powerOff() {
        if (isOn) {
            isOn = false;
            return true;
        }
        return false;
    }

    /*
     * Возвращает true, если устройство было подключено
     * false - иначе
     */
    @Override
    public boolean connect(String deviceName) {
        if (!set.contains(deviceName)) {
            set.add(deviceName);
            return true;
        }
        return false;
    }

    /*
     * Возвращает true, если устройство было отключено
     * false - иначе
     */
    @Override
    public boolean unconnect(String deviceName) {
        if (set.contains(deviceName)) {
            set.remove(deviceName);
            return true;
        }
        return false;
    }

    @Override
    public void setCursor(int x, int y) {
        if (x < 0) {
            vector.setX(0);
            return;
        }
        if (x > 4096) {
            vector.setX(4095);
            return;
        }
        if (y < 0) {
            vector.setY(0);
            return;
        }
        if (y > 4096) {
            vector.setY(4095);
            return;
        }
        vector.setX(x);
        vector.setY(y);
    }

    @Override
    public void setCursor(VectorXY vec) {
        setCursor(vec.getX(), vec.getY());
    }

    @Override
    public int getCursorX() {
        return vector.getX();
    }

    @Override
    public int getCursorY() {
        return vector.getY();
    }

    @Override
    public VectorXY getCurVector() {
        return vector;
    }

    @Override
    public void play(String appName) {
        if (appName == "GTA") {
            if (set.contains("Joystick") || set.contains("Keyboard") && set.contains("Mouse")) {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Вы успешно играете в GTA");
                        Thread.sleep(1000);
                    }
                    Thread.sleep(1000);
                    System.out.println("Наконецто вы наигрались в GTA");
                } catch (InterruptedException e) {
                    System.out.println("Как это могло произойти, но произошло прерывание потока");
                }
            } else {
                System.out.println("Как вы будете играть в GTA без \"Joystick\" или \"Keyboard + Mouse\"?");
                System.out.println("Поиграть в GTA не получилось");
            }
        } else if (appName == "VRCHAT") {
            if (set.contains("VRHelmet")) {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Вы успешно играете в VR chat");
                        Thread.sleep(1000);
                    }
                    Thread.sleep(1000);
                    System.out.println("Наконецто вы наигрались в VR chat");
                } catch (InterruptedException e) {
                    System.out.println("Как это могло произойти, но произошло прерывание потока");
                }
            } else {
                System.out.println("Как вы будете играть в VR chat без \"VRHelmet\"?");
                System.out.println("Поиграть в VR chat не получилось");
            }
        } else if (appName == "DARKSOULS") {
            if (set.contains("Joystick")) {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Вы успешно играете в Dark Souls");
                        Thread.sleep(1000);
                    }
                    Thread.sleep(1000);
                    System.out.println("Наконецто вы наигрались в Dark Souls");
                } catch (InterruptedException e) {
                    System.out.println("Как это могло произойти, но произошло прерывание потока");
                }
            } else {
                System.out.println("Как вы будете играть в Dark Souls без \"Joystick\"?");
                System.out.println("Поиграть в Dark Souls не получилось");
            }
        } else if (appName == "IDEA") {
            if (set.contains("Keyboard")) {
                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Вы успешно прогаете в Itellij IDEA");
                        Thread.sleep(1000);
                    }
                    Thread.sleep(1000);
                    System.out.println("Наконецто вы напрогались в Itellij IDEA");
                } catch (InterruptedException e) {
                    System.out.println("Как это могло произойти, но произошло прерывание потока");
                }
            } else {
                System.out.println("Как вы будете прогать в Itellij IDEA без \"Keyboard\"?");
                System.out.println("Прогать в Itellij IDEA не получилось");
            }
        } else {
            System.out.println("Такого приложения нету, увы");
        }
    }
}
