package ru.omsu.imit.sem5.builder;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.junit.Test;


public class builderTest {
    @Test
    public void testBuildHedgehogSalad() {
        Cook povar = new Cook();
        Plate tarelka = new Plate();
        povar.makeHedgehogSalad(tarelka);
        Salad actual = tarelka.getResult();

        Assert.assertTrue(actual.getSausage() == 100);
        Assert.assertTrue(actual.getCheese() == 100);
        Assert.assertTrue(actual.getEggs() == 3);
        Assert.assertTrue(actual.getCorn() == 140);
        Assert.assertTrue(actual.getGarlic() == 1);
        Assert.assertTrue(actual.getMayonnaise() == 80);
        Assert.assertNull(actual.getChickenBreast());
        Assert.assertNull(actual.getMushrooms());
        Assert.assertNull(actual.getOnion());
        Assert.assertNull(actual.getSunflowerOil());
        Assert.assertNull(actual.getSalt());
        Assert.assertNull(actual.getRedPepper());
        Assert.assertNull(actual.getBlackPepper());
        Assert.assertNull(actual.getCucumber());
        Assert.assertNull(actual.getMustard());
    }
}
