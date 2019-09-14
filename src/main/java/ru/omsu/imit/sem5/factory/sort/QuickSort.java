package ru.omsu.imit.sem5.factory.sort;

import ru.omsu.imit.sem5.factory.interfaces.Sort;

public class QuickSort implements Sort
{

    public void printArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[array.length - 1]);
    }

    public void sort(int[] arr) {
        System.out.println("Quick sorting");
        int array[] = arr;
        int startIndex = 0;
        int endIndex = array.length - 1;
        doSort(startIndex, endIndex, array);
        printArray(array);
    }

    private void doSort(int start, int end, int[] array) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur, array);
        doSort(cur+1, end, array);
    }
}
