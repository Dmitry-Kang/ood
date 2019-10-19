package ru.omsu.imit.sem5.structural.adapter;

import java.util.Objects;

public class FigureToTableLegAdapter extends TableLeg
{
    Figure figure;

    public FigureToTableLegAdapter(Figure figure)
    {
        super(0);
        this.figure = figure;
    }

    @Override
    public boolean hasLength(int h) {
        return figure.getX() == h ||
               figure.getY() == h ||
               figure.getZ() == h;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FigureToTableLegAdapter adapter = (FigureToTableLegAdapter) o;
        return Objects.equals(figure, adapter.figure);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(figure);
    }
}
