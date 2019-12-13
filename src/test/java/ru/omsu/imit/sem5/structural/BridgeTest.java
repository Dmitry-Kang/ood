package ru.omsu.imit.sem5.structural;

import org.junit.Test;
import ru.omsu.imit.sem5.structural.bridge.Joystick;
import ru.omsu.imit.sem5.structural.bridge.PC;
import ru.omsu.imit.sem5.structural.bridge.VRHelmet;

public class BridgeTest {
    @Test
    public void TestPC() {
        PC pc = new PC();
        // Пробуем поиграть в vr chat без вр очков
        // Играем в dark souls c джойстиком
        Joystick joystick = new Joystick(pc);
        joystick.connect();

        pc.play("DARKSOULS");
        pc.play("VRCHAT");

        VRHelmet vrHelmet = new VRHelmet(pc);
        pc.play("VRCHAT");
    }
}
