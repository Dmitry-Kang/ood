package ru.omsu.imit.sem5.structural.decorator;

import java.util.Random;

public class SmartHouseFridge extends SmartHouseDevice {
    private int temperature;

    public SmartHouseFridge(SmartHouse smartHouse) {
        super(smartHouse);
        getTemperature();
    }

    @Override
    public void work() {
        getTemperature();
        System.out.println("Температура хлодильника: " + temperature);
        if (temperature > -1) {
            System.out.println("Неприемлимая температура для холодильника");
            System.out.println("Фиксируем");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            fixTemperature();
            System.out.println("Температура хлодильника: " + temperature);
        }
        System.out.println("Температура для холодильника приемлимая");
        super.work();
    }

    public int getTemperature() {
        Random rand = new Random();
        temperature = (int) (Math.sin(rand.nextInt(360)) * 30) ;
        return temperature;
    }

    private int fixTemperature() {
        Random rand = new Random();
        temperature =(int) (rand.nextDouble()%1 * (-29) -1) ;
        return temperature;
    }

}
