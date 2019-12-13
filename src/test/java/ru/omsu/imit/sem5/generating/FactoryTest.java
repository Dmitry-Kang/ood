package ru.omsu.imit.sem5.generating;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import ru.omsu.imit.sem5.generating.factory.fabrics.SortFabric;
import ru.omsu.imit.sem5.generating.factory.interfaces.Fabric;

public class FactoryTest
{
    @Test
    public void testFabricPattern() {
        int[] ints = {11, 3, 22 , 44, 33, 22, 0, -10, 102};
        int[] expected = {-10, 0 , 3, 11, 22, 22, 33, 44, 102};
        Fabric f = new SortFabric();
        assertArrayEquals(expected, f.sortQuick(ints));
        assertArrayEquals(expected, f.sortHeap(ints));
        assertArrayEquals(expected, f.sortBucket(ints));
    }
}
