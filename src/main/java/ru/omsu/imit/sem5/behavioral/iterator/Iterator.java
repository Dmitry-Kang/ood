package ru.omsu.imit.sem5.behavioral.iterator;

public interface Iterator {
    boolean hasNext();
    Task next();
    void taskDone();
}
