package ru.omsu.imit.sem5.generating.abstractfactory;

import ru.omsu.imit.sem5.generating.abstractfactory.interfaces.Bed;
import ru.omsu.imit.sem5.generating.abstractfactory.interfaces.Chair;
import ru.omsu.imit.sem5.generating.abstractfactory.interfaces.Sofa;

import java.util.Vector;

/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
class Shop {
    private Vector<Sofa> sofas = new Vector<>();
    private Vector<Chair> chairs = new Vector<>();
    private Vector<Bed> beds = new Vector<>();
    private int cash = 100;

    boolean buySofa(Sofa sofa) {
        if (cash - sofa.getPrice() >= 0) {
            sofas.add(sofa);
            cash -= sofa.getPrice();
            return true;
        }

//        System.out.println("No money to buy sofa");
        return false;
    }

    boolean buyChair(Chair chair) {
        if (cash - chair.getPrice() >= 0) {
            chairs.add(chair);
            cash -= chair.getPrice();
            return true;
        }

//        System.out.println("No money to buy chair");
        return false;
    }

    boolean buyBed(Bed bed) {
        if (cash - bed.getPrice() >= 0) {
            beds.add(bed);
            cash -= bed.getPrice();
            return true;
        }

//        System.out.println("No money to buy bed");
        return false;
    }

    boolean sellSofa(Sofa sofa) {
        if (sofas.contains(sofa)) {
            cash += sofa.getPrice();
            sofas.remove(sofa);
            return true;
        }

//        System.out.println("Sofa not found");
        return false;
    }

    boolean sellChair(Chair chair) {
        if (chairs.contains(chair)) {
            cash += chair.getPrice();
            chairs.remove(chair);
            return true;
        }

//        System.out.println("Chair not found");
        return false;
    }

    boolean sellBed(Bed bed) {
        if (beds.contains(bed)) {
            cash += bed.getPrice();
            beds.remove(bed);
            return true;
        }

//        System.out.println("Bed not found");
        return false;
    }

    int getCash() {
        return cash;
    }
}
