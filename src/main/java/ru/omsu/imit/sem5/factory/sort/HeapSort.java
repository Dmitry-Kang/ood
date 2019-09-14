package ru.omsu.imit.sem5.factory.sort;

import ru.omsu.imit.sem5.factory.interfaces.Sort;

public class HeapSort implements Sort
{
    private static int heapSize;

    public void printArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[array.length - 1]);
    }

    public void sort(int arr[])
    {
        System.out.println("Heap sorting");
        int[] a = arr;
        int n = a.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(a, n, i);

        for (int i=n-1; i>=0; i--)
        {
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            heapify(a, i, 0);
        }
        printArray(a);
    }

    void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;


        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}
