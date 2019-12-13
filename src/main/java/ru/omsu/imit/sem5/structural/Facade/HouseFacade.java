package ru.omsu.imit.sem5.structural.Facade;

public class HouseFacade {
    public String solveAllProblemsAtHome(Apartment apartment) {

        // уборка комнат + мебель

        Room[] rooms = apartment.getRooms();
        for (Room room: rooms) {
            room.cleanCabinets(); // почистить шкафы
            room.cleanObjectsOnShelves(); // почистить предметы на полке от пыли
            room.cleanShelves(); // почистить полки
            room.washCurtains(); // помыть шторы
            room.cleanSofas(); // почистить диваны
            room.vacuumCarpets(); // пропылесосить ковры
            room.washFloors(); // промыть пол
        }

        // Настройка электроники

        Device[] devices = apartment.getDevices();
        for (Device device: devices) {
            device.cleanInside(); // почистить от пыли изнутри
            device.changeThermalGrease(); // поменять термопасту (если это ноутбук или пк)
            device.charge(); // поставить на зарядку (если это смартфон или устройство с акб)
            device.plugIntoPowerOutlet(); // подключить в розетку (если это пк или любое устройство без акб)
            device.fillUp(); // заправить чем либо (увлажнитель воздуха заправляется водой и т.д.)
        }

        // Сделать всё остальное



    }
}
