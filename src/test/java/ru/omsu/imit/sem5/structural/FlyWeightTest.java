package ru.omsu.imit.sem5.structural;

import org.junit.Test;
import ru.omsu.imit.sem5.structural.flyweight.RoomWithWalls;

import java.awt.*;

public class FlyWeightTest {
    @Test
    public void Test() {
        RoomWithWalls room = new RoomWithWalls(100);
        room.work();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

