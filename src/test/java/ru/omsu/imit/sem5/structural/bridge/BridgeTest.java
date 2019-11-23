package ru.omsu.imit.sem5.structural.bridge;

import org.junit.Test;

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
