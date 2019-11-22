package ru.omsu.imit.sem5.structural.composite;

import org.junit.Test;

public class CompositeTest {
    @Test
    public void testComposite() { // TODO доделать, тут очень простой пример
        // Розетка есть, к розетке можно соединить ещё розетки, а к ним ещё разные устройства и все они потребляют ватты

        Lamp a = new Lamp();
        extender ex = new extender(a);

        extender ax = new extender();
        Lamp b = new Lamp();
        ax.addDevice(b);

        ex.addDevice(ax);
        ex.turnOn();
        ax.turnOn();
        a.turnOn();
        b.turnOn();
        System.out.println(ex.getWatt());
    }
}
