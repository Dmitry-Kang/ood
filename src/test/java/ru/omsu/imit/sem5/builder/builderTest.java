package ru.omsu.imit.sem5.builder;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.junit.Test;
import ru.omsu.imit.sem5.builder.classes.Cook;
import ru.omsu.imit.sem5.builder.classes.Plate;
import ru.omsu.imit.sem5.builder.classes.Salad;


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
        Assert.assertTrue(actual.getChickenBreast() == 0);
        Assert.assertTrue(actual.getMushrooms() == 0);
        Assert.assertTrue(actual.getOnion() == 0);
        Assert.assertTrue(actual.getSunFlowerOil() == 0);
        Assert.assertTrue(actual.getSalt() == 0);
        Assert.assertTrue(actual.getRedPepper() == 0);
        Assert.assertTrue(actual.getBlackPepper() == 0);
        Assert.assertTrue(actual.getCucumber() == 0);
        Assert.assertTrue(actual.getMustard() == 0);
    }
}
