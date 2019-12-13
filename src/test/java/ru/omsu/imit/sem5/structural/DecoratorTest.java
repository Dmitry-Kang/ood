package ru.omsu.imit.sem5.structural;

import org.junit.Test;
import ru.omsu.imit.sem5.structural.decorator.SmartHouseDevice;
import ru.omsu.imit.sem5.structural.decorator.SmartHouseFridge;
import ru.omsu.imit.sem5.structural.decorator.SmartHouseMainController;
import ru.omsu.imit.sem5.structural.decorator.SmartHouseSmokeController;

public class DecoratorTest {
    @Test
    public void testDecorator() {
        SmartHouseDevice house = new SmartHouseSmokeController(
                                 new SmartHouseFridge(
                                 new SmartHouseMainController("out/OutputDemo.txt")));
        house.work();
    }
}
