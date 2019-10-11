package ru.omsu.imit.sem5.generating.abstractfactory.factories;

import ru.omsu.imit.sem5.generating.abstractfactory.beds.LofaBed;
import ru.omsu.imit.sem5.generating.abstractfactory.chairs.LofaChair;
import ru.omsu.imit.sem5.generating.abstractfactory.interfaces.Bed;
import ru.omsu.imit.sem5.generating.abstractfactory.interfaces.Chair;
import ru.omsu.imit.sem5.generating.abstractfactory.interfaces.FurnitureFactory;
import ru.omsu.imit.sem5.generating.abstractfactory.interfaces.Sofa;
import ru.omsu.imit.sem5.generating.abstractfactory.sofas.LofaSofa;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class LofaFactory implements FurnitureFactory {
    public Chair createChair() {
        return new LofaChair();
    }
    public Sofa createSofa() {
        return new LofaSofa();
    }
    public Bed createBed() {
        return new LofaBed();
    }
}
