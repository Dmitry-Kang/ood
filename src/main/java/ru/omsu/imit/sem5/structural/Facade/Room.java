package ru.omsu.imit.sem5.structural.Facade;

public class Room {

    public void cleanCabinets() {
        System.out.println("Чистим шкафы");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Почистили шкафы");
    }

    cleanObjectsOnShelves() {
        System.out.println("Чистим предметы на полках");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Почистили предметы на полках");
    }
    cleanShelves(); {
        System.out.println("Чистим сами полки");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Почистили полки");
    }
    washCurtains() {
        System.out.println("Моем шторы");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Помыли шторы");
    }
    cleanSofas(); // почистить диваны
    vacuumCarpets(); // пропылесосить ковры
    washFloors(); // промыть пол
}
