package ru.omsu.imit.sem5.behavioral;

import org.junit.Test;
import ru.omsu.imit.sem5.behavioral.memento.SimpleVersionController;
import ru.omsu.imit.sem5.behavioral.memento.Minecraft;

public class MementoTest {
    @Test
    public void testMemento() {
        Minecraft minecraft = new Minecraft();
        minecraft.setVersion("1.5.2");

        SimpleVersionController simpleVersionController = new SimpleVersionController();
        simpleVersionController.setMemento(minecraft.createMemento());

        minecraft.setVersion("1.8.1");
        minecraft.getDataFromMomento(simpleVersionController.getMemento());

        System.out.println(minecraft.getVersion());
    }
}
