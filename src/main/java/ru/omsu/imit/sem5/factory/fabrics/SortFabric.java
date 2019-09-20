package ru.omsu.imit.sem5.factory.fabrics;

import ru.omsu.imit.sem5.factory.interfaces.Fabric;
import ru.omsu.imit.sem5.factory.sort.BucketSort;
import ru.omsu.imit.sem5.factory.sort.HeapSort;
import ru.omsu.imit.sem5.factory.sort.QuickSort;

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
