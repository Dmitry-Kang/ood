package ru.omsu.imit.sem5.generating.abstractfactory.factories;

import ru.omsu.imit.sem5.generating.abstractfactory.beds.EcoBed;
import ru.omsu.imit.sem5.generating.abstractfactory.chairs.EcoChair;
import ru.omsu.imit.sem5.generating.abstractfactory.interfaces.Bed;
import ru.omsu.imit.sem5.generating.abstractfactory.interfaces.Chair;
import ru.omsu.imit.sem5.generating.abstractfactory.interfaces.FurnitureFactory;
import ru.omsu.imit.sem5.generating.abstractfactory.interfaces.Sofa;
import ru.omsu.imit.sem5.generating.abstractfactory.sofas.EcoSofa;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class EcoFactory implements FurnitureFactory {
    public Chair createChair() {
        return new EcoChair();
    }
    public Sofa createSofa() {
        return new EcoSofa();
    }
    public Bed createBed() {
        return new EcoBed();
    }
}
