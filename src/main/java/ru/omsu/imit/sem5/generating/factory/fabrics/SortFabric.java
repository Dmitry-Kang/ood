package ru.omsu.imit.sem5.generating.factory.fabrics;

import ru.omsu.imit.sem5.generating.factory.interfaces.Fabric;
import ru.omsu.imit.sem5.generating.factory.sort.BucketSort;
import ru.omsu.imit.sem5.generating.factory.sort.HeapSort;
import ru.omsu.imit.sem5.generating.factory.sort.QuickSort;

public class SortFabric implements Fabric
{

    public int[] sortQuick(int[] arr) {
        return new QuickSort().sort(arr);
    }

    public int[] sortHeap(int[] arr) {
        return new HeapSort().sort(arr);
    }

    public int[] sortBucket(int[] arr) {
        return new BucketSort().sort(arr);
    }
}
