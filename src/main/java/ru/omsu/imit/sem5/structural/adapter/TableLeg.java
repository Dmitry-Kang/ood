package ru.omsu.imit.sem5.structural.adapter;

public class TableLeg
{
    private int h;

    public TableLeg(int h)
    {
        this.h = h;
    }

    public int getH()
    {
        return h;
    }

    public void setH(int h)
    {
        this.h = h;
    }

    public boolean hasLength(int h) {
        return this.h == h;
    }
}
