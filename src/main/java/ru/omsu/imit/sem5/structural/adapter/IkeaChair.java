package ru.omsu.imit.sem5.structural.adapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IkeaChair
{
    private int x;
    private int y;
    private int chH;
    private List<TableLeg> legs;

    public IkeaChair(int x, int y, int chH)
    {
        this.x = x;
        this.y = y;
        this.chH = chH;
        legs = new ArrayList<>();
    }

    public boolean addLeg(TableLeg leg) {
        if (leg.hasLength(chH) && !legs.contains(leg)) {
            legs.add(leg);
            return true;
        }
        return false;
    }

    public boolean delLeg(TableLeg leg) {
        if (legs.contains(leg)) {
            legs.remove(leg);
            return true;
        }
        return false;
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

    public int getChH()
    {
        return chH;
    }

    public void setChH(int chH)
    {
        this.chH = chH;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IkeaChair ikeaChair = (IkeaChair) o;
        return x == ikeaChair.x &&
                y == ikeaChair.y &&
                chH == ikeaChair.chH;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(x, y, chH);
    }
}
