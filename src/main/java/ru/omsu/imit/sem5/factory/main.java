package ru.omsu.imit.sem5.factory;

import ru.omsu.imit.sem5.factory.fabrics.SortFabric;
import ru.omsu.imit.sem5.factory.interfaces.Fabric;

public class main {
    static void printArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[array.length - 1]);
    }

    public static void main( String[] args ) {
        int[] ints = {11, 03, 22 , 44, 33, 22, 0, -10, 102};
        System.out.println("Base array");
        printArray(ints);
        Fabric f = new SortFabric();
        f.work(ints);
    }
}
