package ru.omsu.imit.sem5.prototype;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class prototypeTest {
    @Test
    public void testPrototypePattern() {
        List<AndroidApp> apps = new ArrayList<>();
        List<AndroidApp> copyApps = new ArrayList<>();

        AndroidApp doublegis = new AndroidApp(7, "navigator for your android", "2gis", 20);
        AndroidApp uber = new AndroidApp(8, "taxi for your android", "Uber", 30);
        AndroidApp chromebrowser = new AndroidApp(5, "browser for your android", "Google Chrome", 100);
        apps.add(doublegis);
        apps.add(uber);
        apps.add(chromebrowser);

        for (int i = 0; i < apps.size(); i++) {
            copyApps.add(apps.get(i).clone());
            Assert.assertEquals(apps.get(i), copyApps.get(i));
        }
    }
}
