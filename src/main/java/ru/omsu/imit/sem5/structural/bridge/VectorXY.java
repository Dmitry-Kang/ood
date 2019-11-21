package ru.omsu.imit.sem5.structural.bridge;

import java.util.Objects;

public class VectorXY {
    private int x;
    private int y;

    VectorXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "VectorXY{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VectorXY)) return false;
        VectorXY vector = (VectorXY) o;
        return getX() == vector.getX() &&
                getY() == vector.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }
}
