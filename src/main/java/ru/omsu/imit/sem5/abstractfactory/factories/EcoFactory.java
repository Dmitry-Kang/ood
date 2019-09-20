package ru.omsu.imit.sem5.abstractfactory.factories;

import ru.omsu.imit.sem5.abstractfactory.beds.EcoBed;
import ru.omsu.imit.sem5.abstractfactory.chairs.EcoChair;
import ru.omsu.imit.sem5.abstractfactory.interfaces.Bed;
import ru.omsu.imit.sem5.abstractfactory.interfaces.Chair;
import ru.omsu.imit.sem5.abstractfactory.interfaces.FurnitureFactory;
import ru.omsu.imit.sem5.abstractfactory.interfaces.Sofa;
import ru.omsu.imit.sem5.abstractfactory.sofas.EcoSofa;

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
