package ru.omsu.imit.sem5.abstractfactory.factories;

import ru.omsu.imit.sem5.abstractfactory.beds.LofaBed;
import ru.omsu.imit.sem5.abstractfactory.chairs.LofaChair;
import ru.omsu.imit.sem5.abstractfactory.interfaces.Bed;
import ru.omsu.imit.sem5.abstractfactory.interfaces.Chair;
import ru.omsu.imit.sem5.abstractfactory.interfaces.FurnitureFactory;
import ru.omsu.imit.sem5.abstractfactory.interfaces.Sofa;
import ru.omsu.imit.sem5.abstractfactory.sofas.LofaSofa;

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
