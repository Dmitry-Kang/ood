package ru.omsu.imit.sem5.abstractfactory;

import org.junit.Assert;
import org.junit.Test;
import ru.omsu.imit.sem5.abstractfactory.factories.EcoFactory;
import ru.omsu.imit.sem5.abstractfactory.factories.HiTechFactory;
import ru.omsu.imit.sem5.abstractfactory.factories.LofaFactory;
import ru.omsu.imit.sem5.abstractfactory.interfaces.Bed;
import ru.omsu.imit.sem5.abstractfactory.interfaces.Chair;
import ru.omsu.imit.sem5.abstractfactory.interfaces.FurnitureFactory;
import ru.omsu.imit.sem5.abstractfactory.interfaces.Sofa;

public class abstractFactoryTest {

    @Test
    public void testabstractFactory() {
        // Создадим наш магазин который работает с мебелью
        Shop shop = new Shop();
        // Создадим производители мебели
        // Мы не знаем, как со временем изменяется состав продукта.
        // Мы знаем что от них требуется всегда одно - мебель.
        FurnitureFactory hitechfurniture = new HiTechFactory();
        FurnitureFactory ecofurniture = new EcoFactory();
        FurnitureFactory lofafurniture = new LofaFactory();
        // создадим по 2 каждой мебели стиля Хай-тек
        Sofa[] hitechsofas = {hitechfurniture.createSofa(), hitechfurniture.createSofa()};
        hitechsofas[0].setPrice(10);
        hitechsofas[0].setTVRemote("XiaomiTVRemote");
        hitechsofas[1].setPrice(20);
        hitechsofas[1].setTVRemote("MeizuTVRemote");

        Chair[] hitechchairs = {hitechfurniture.createChair(), hitechfurniture.createChair()};
        hitechchairs[0].setPillows(1);
        hitechchairs[0].setPrice(11);
        hitechchairs[1].setPillows(2);
        hitechchairs[1].setPrice(22);

        Bed[] hitechbeds = {hitechfurniture.createBed(), hitechfurniture.createBed()};
        hitechbeds[0].setMattress("SimpleMatress");
        hitechbeds[0].setPrice(5);
        hitechbeds[1].setMattress("SteelMatress");
        hitechbeds[1].setPrice(15);

        // Создадим одно кресло Лофа стиля
        Chair lofachair = lofafurniture.createChair();
        lofachair.setPillows(5);
        lofachair.setPrice(23);

        // Создадим кровать и диван стиля Эко
        Bed ecobed = ecofurniture.createBed();
        Sofa ecosofa = ecofurniture.createSofa();
        ecobed.setMattress("Ecologically Clear Matress");
        ecobed.setPrice(100500);

        ecosofa.setTVRemote("Eco materials TV remote");
        ecosofa.setPrice(50);

        // Дальше будет работа с магазином
        Assert.assertFalse(shop.buyBed(ecobed)); // Денег не должно хватить
        Assert.assertFalse(shop.sellChair(lofachair)); // Такого предмета нету в магазине

        for (Bed b: hitechbeds) {
            shop.buyBed(b);
        }
        for (Sofa s: hitechsofas) {
            shop.buySofa(s);
        }
        for (Chair c: hitechchairs) {
            shop.buyChair(c);
        }

        Assert.assertEquals(17 ,shop.getCash()); // Проверим работу покупки мебели

        for (Bed b: hitechbeds) {
            b.setPrice(20);
            shop.sellBed(b);
        }
        for (Sofa s: hitechsofas) {
            s.setPrice(30);
            shop.sellSofa(s);
        }
        for (Chair c: hitechchairs) {
            c.setPrice(40);
            shop.sellChair(c);
        }

        Assert.assertEquals(197 ,shop.getCash()); // Проверим работу продажи мебели
    }
}
