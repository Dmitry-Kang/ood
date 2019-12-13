package ru.omsu.imit.sem5.structural;

import org.junit.Test;
import ru.omsu.imit.sem5.structural.composite.Lamp;
import ru.omsu.imit.sem5.structural.composite.extender;

public class CompositeTest {
    @Test
    public void testComposite() {
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
        //b.turnOn();
        System.out.println(ex.getWatt());
    }
}
