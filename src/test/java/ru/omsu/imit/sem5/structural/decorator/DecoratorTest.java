package ru.omsu.imit.sem5.structural.decorator;

import org.junit.Test;

public class DecoratorTest {
    @Test
    public void testDecorator() {
        SmartHouseDevice house = new SmartHouseSmokeController(
                                 new SmartHouseFridge(
                                 new SmartHouseMainController("out/OutputDemo.txt")));
        house.work();
    }
}
