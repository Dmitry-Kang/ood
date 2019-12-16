package ru.omsu.imit.sem5.behavioral;

import org.junit.Assert;
import org.junit.Test;
import ru.omsu.imit.sem5.behavioral.mediator.*;


public class MediatorTest {
    @Test
    public void testMediator() {
        Mediator mediator = new Amazon();

        Component human1 = new Human(mediator, "Bob", 100);

        Item smartphone = new Item("Smartphone", 10);
        Item laptop = new Item("Laptop", 20);

        human1.getItems().add(smartphone);
        human1.getItems().add(laptop);

        human1.sellItem(smartphone);
        human1.sellItem(laptop);

        Component human2 = new Human(mediator, "Astley", 50);
        human2.buyItem("Smartphone");
        Assert.assertTrue(human2.getCash() == 40);
        human2.buyItem("Laptop");
        Assert.assertTrue(human2.getCash() == 20);
        Assert.assertTrue(human1.getCash() == 130);
    }
}
