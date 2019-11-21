/*
package ru.omsu.imit.sem5.structural.adapter;


import org.junit.Assert;
import org.junit.Test;

public class adapterTest {

    @Test
    public void testAdapter() {
        IkeaChair chair = new IkeaChair(10,20, 5);
        TableLeg leg1 = new TableLeg(5);
        TableLeg leg2 = new TableLeg(4);
        TableLeg leg3 = new TableLeg(5);
        TableLeg leg4 = new TableLeg(5);
        TableLeg leg5 = leg1;

        Assert.assertTrue(chair.addLeg(leg1));
        Assert.assertTrue(chair.addLeg(leg3));
        Assert.assertTrue(chair.addLeg(leg4));

        Assert.assertFalse(chair.addLeg(leg5));
        Assert.assertFalse(chair.addLeg(leg2));

        Figure figure1 = new Figure("Wood", 10, 2, 4);
        Figure figure2 = new Figure("Wood", 10, 2, 5);
        FigureToTableLegAdapter adapter1 = new FigureToTableLegAdapter(figure1);
        FigureToTableLegAdapter adapter2 = new FigureToTableLegAdapter(figure2);

        Assert.assertFalse(chair.addLeg(adapter1));
        Assert.assertTrue(chair.addLeg(adapter2));
    }
}
 */
