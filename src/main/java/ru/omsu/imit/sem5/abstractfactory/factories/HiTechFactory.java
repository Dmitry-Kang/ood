package ru.omsu.imit.sem5.abstractfactory.factories;

import ru.omsu.imit.sem5.abstractfactory.beds.HiTechBed;
import ru.omsu.imit.sem5.abstractfactory.chairs.HiTechChair;
import ru.omsu.imit.sem5.abstractfactory.interfaces.Bed;
import ru.omsu.imit.sem5.abstractfactory.interfaces.Chair;
import ru.omsu.imit.sem5.abstractfactory.interfaces.FurnitureFactory;
import ru.omsu.imit.sem5.abstractfactory.interfaces.Sofa;
import ru.omsu.imit.sem5.abstractfactory.sofas.HiTechSofa;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class HiTechFactory implements FurnitureFactory {
    public Chair createChair() {
        return new HiTechChair();
    }
    public Sofa createSofa() {
        return new HiTechSofa();
    }
    public Bed createBed() {
        return new HiTechBed();
    }
}
