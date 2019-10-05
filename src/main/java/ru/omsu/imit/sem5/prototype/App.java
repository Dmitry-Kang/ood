package ru.omsu.imit.sem5.prototype;

import java.util.Objects;

public abstract class App {
    private String name;
    private int size;

    public App() {}

    public App(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public App(App app) {
        if (app != null) {
            this.name = app.getName();
            this.size = app.getSize();
        }
    }

    public abstract App clone();

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        App app = (App) o;
        return size == app.size &&
                Objects.equals(name, app.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }
}
