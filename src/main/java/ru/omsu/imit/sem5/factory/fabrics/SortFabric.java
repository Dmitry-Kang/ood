package ru.omsu.imit.sem5.factory.fabrics;

import ru.omsu.imit.sem5.factory.interfaces.Fabric;
import ru.omsu.imit.sem5.factory.interfaces.Sort;
import ru.omsu.imit.sem5.factory.sort.BucketSort;
import ru.omsu.imit.sem5.factory.sort.HeapSort;
import ru.omsu.imit.sem5.factory.sort.QuickSort;

public class SortFabric implements Fabric
{
    private Sort[] sorts = {new QuickSort(), new HeapSort(), new BucketSort()};

    @Override
    public void work(int[] arr) {
        for (Sort elem: sorts) {
            elem.sort(arr);
        }
    }
}
