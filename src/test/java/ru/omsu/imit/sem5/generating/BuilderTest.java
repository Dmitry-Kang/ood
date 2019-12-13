package ru.omsu.imit.sem5.generating;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.junit.Test;
import ru.omsu.imit.sem5.generating.builder.classes.Cook;
import ru.omsu.imit.sem5.generating.builder.classes.Plate;
import ru.omsu.imit.sem5.generating.builder.classes.Salad;


public class BuilderTest {
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

    @Test
    public void testMushroomChickenSalad() {
        Cook povar = new Cook();
        Plate tarelka = new Plate();
        povar.makeMushroomChickenSalad(tarelka);
        Salad actual = tarelka.getResult();

        Assert.assertTrue(actual.getMayonnaise() == 50);
        Assert.assertTrue(actual.getChickenBreast() == 1);
        Assert.assertTrue(actual.getMushrooms() == 150);
        Assert.assertTrue(actual.getOnion() == 2);
        Assert.assertTrue(actual.getSunFlowerOil() == 20);
        Assert.assertTrue(actual.getSalt() == 20);
        Assert.assertTrue(actual.getCheese() == 100);
        Assert.assertTrue(actual.getEggs() == 2);
        Assert.assertTrue(actual.getCorn() == 0);
        Assert.assertTrue(actual.getGarlic() == 0);
        Assert.assertTrue(actual.getSausage() == 0);
        Assert.assertTrue(actual.getRedPepper() == 0);
        Assert.assertTrue(actual.getBlackPepper() == 0);
        Assert.assertTrue(actual.getCucumber() == 0);
        Assert.assertTrue(actual.getMustard() == 0);
    }

    @Test
    public void testRainbowSalad() {
        Cook povar = new Cook();
        Plate tarelka = new Plate();
        povar.makeRainbowSalad(tarelka);
        Salad actual = tarelka.getResult();

        Assert.assertTrue(actual.getMayonnaise() == 100);
        Assert.assertTrue(actual.getChickenBreast() == 0);
        Assert.assertTrue(actual.getMushrooms() == 0);
        Assert.assertTrue(actual.getOnion() == 70);
        Assert.assertTrue(actual.getSunFlowerOil() == 0);
        Assert.assertTrue(actual.getSalt() == 20);
        Assert.assertTrue(actual.getCheese() == 0);
        Assert.assertTrue(actual.getEggs() == 3);
        Assert.assertTrue(actual.getCorn() == 200);
        Assert.assertTrue(actual.getGarlic() == 0);
        Assert.assertTrue(actual.getSausage() == 300);
        Assert.assertTrue(actual.getRedPepper() == 200);
        Assert.assertTrue(actual.getBlackPepper() == 50);
        Assert.assertTrue(actual.getCucumber() == 200);
        Assert.assertTrue(actual.getMustard() == 2);
    }
}
