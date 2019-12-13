package ru.omsu.imit.sem5.structural.facade;

import org.junit.Test;
import ru.omsu.imit.sem5.structural.Facade.Apartment;
import ru.omsu.imit.sem5.structural.Facade.Device;
import ru.omsu.imit.sem5.structural.Facade.HouseFacade;
import ru.omsu.imit.sem5.structural.Facade.Room;

public class FacadeTest {
    @Test
    public void facadeTest() {
        Apartment apartment = new Apartment();
        for (int i = 0; i < 5; i++) {
            apartment.addRoom(new Room());
            apartment.addDevice(new Device());
        }
        System.out.println(HouseFacade.solveAllProblemsAtHome(apartment));
    }
}
