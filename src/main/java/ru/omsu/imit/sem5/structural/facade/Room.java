package ru.omsu.imit.sem5.structural.facade;

import java.util.Random;

public class Room {
    private int numCabinets;
    private int numShelves;
    private int numCurtains;
    private int numSofas;
    private int numCarpets;

    public Room() {
        Random rand = new Random();
        numCabinets = rand.nextInt(2);
        numShelves = rand.nextInt(4);
        numCurtains = rand.nextInt(2);
        numSofas = rand.nextInt(1);
        numCarpets = rand.nextInt(2);
    }

    public void cleanCabinets() {
        System.out.println("Чистим шкафы...");
        try {
            for (int i = 0; i < numCabinets; i++) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cleanShelves() {
        System.out.println("Чистим полки...");
        try {
            for (int i = 0; i < numShelves; i++) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void washCurtains() {
        System.out.println("Моем шторы...");
        try {
            for (int i = 0; i < numCurtains; i++) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void cleanSofas() {
        System.out.println("Чистим диваны...");
        try {
            for (int i = 0; i < numSofas; i++) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void vacuumCarpets() {
        System.out.println("Пылесосим ковры...");
        try {
            for (int i = 0; i < numCarpets; i++) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void washFloors() {
        System.out.println("Моем пол...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
