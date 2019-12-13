package ru.omsu.imit.sem5.structural;

import org.junit.Test;
import ru.omsu.imit.sem5.structural.facade.Apartment;
import ru.omsu.imit.sem5.structural.facade.Device;
import ru.omsu.imit.sem5.structural.facade.HouseFacade;
import ru.omsu.imit.sem5.structural.facade.Room;

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
