package ru.omsu.imit.sem5.structural.Facade;

import java.util.List;

public class HouseFacade {
    public static String solveAllProblemsAtHome(Apartment apartment) {

        // уборка комнат + мебель

        List<Room> rooms = apartment.getRooms();
        System.out.println("Решаем проблемы комнат и мебели");
        for (Room room: rooms) {
            room.cleanCabinets(); // почистить шкафы
            room.cleanShelves(); // почистить полки
            room.washCurtains(); // помыть шторы
            room.cleanSofas(); // почистить диваны
            room.vacuumCarpets(); // пропылесосить ковры
            room.washFloors(); // промыть пол
        }

        // Настройка электроники

        List<Device> devices = apartment.getDevices();
        System.out.println("Решаем проблемы электроники...");
        for (Device device: devices) {
            device.cleanInside(); // почистить от пыли изнутри
            device.changeThermalGrease(); // поменять термопасту (если это ноутбук или пк)
            device.charge(); // поставить на зарядку (если это смартфон или устройство с акб)
            device.plugIntoPowerOutlet(); // подключить в розетку (если это пк или любое устройство без акб)
            device.fillUp(); // заправить чем либо (увлажнитель воздуха заправляется водой и т.д.)
        }

        // Остальное ненадо

        return "┈╭━╮┈┈╭━╮\n" +
               "┈┃╮┗━━┛╭┃\n" +
               "┈╰┓▉┈┈▉┏╯\n" +
               "┈┈┃┈▅┈┈┃\n" +
               "╭━┫╰┻╯┈┣━╮\n" +
               "┃╰┻━━━━┻╯┗━━╮\n" +
               "┃┈┈┈┈┈┈┈┈┏━╮┃\n" +
               "┃┈┈┈┈┈┈┈┈┃┈┃┃\n" +
               "┃┈┈┈┈┈┈┈┈┗━╯┃\n" +
               "┃┈┈┈┈┈┈┈┈┏━━╯\n" +
               "╰━━━━━━━━╯";
    }
}
