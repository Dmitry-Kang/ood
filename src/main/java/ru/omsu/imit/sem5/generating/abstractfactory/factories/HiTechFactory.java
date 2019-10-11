package ru.omsu.imit.sem5.generating.abstractfactory.factories;

import ru.omsu.imit.sem5.generating.abstractfactory.beds.HiTechBed;
import ru.omsu.imit.sem5.generating.abstractfactory.chairs.HiTechChair;
import ru.omsu.imit.sem5.generating.abstractfactory.interfaces.Bed;
import ru.omsu.imit.sem5.generating.abstractfactory.interfaces.Chair;
import ru.omsu.imit.sem5.generating.abstractfactory.interfaces.FurnitureFactory;
import ru.omsu.imit.sem5.generating.abstractfactory.interfaces.Sofa;
import ru.omsu.imit.sem5.generating.abstractfactory.sofas.HiTechSofa;

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
