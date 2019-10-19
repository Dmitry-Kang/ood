package ru.omsu.imit.sem5.structural.adapter;

import java.util.Objects;

public class Figure
{
    private String material;
    private int x;
    private int y;
    private int z;

    public Figure(String material, int x, int y, int z)
    {
        this.material = material;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String getMaterial()
    {
        return material;
    }

    public void setMaterial(String material)
    {
        this.material = material;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getZ()
    {
        return z;
    }

    public void setZ(int z)
    {
        this.z = z;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return x == figure.x &&
                y == figure.y &&
                z == figure.z &&
                Objects.equals(material, figure.material);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(material, x, y, z);
    }
}
