package ru.omsu.imit.sem5.factory.interfaces;

public interface Sort {
    void printArray(int[] array);

    default void sort(int[] arr) {

    }
}
