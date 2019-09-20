package ru.omsu.imit.sem5.abstractfactory.interfaces;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    Bed createBed();
}
