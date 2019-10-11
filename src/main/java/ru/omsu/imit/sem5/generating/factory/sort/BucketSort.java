package ru.omsu.imit.sem5.generating.factory.sort;

import ru.omsu.imit.sem5.generating.factory.interfaces.Sort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class BucketSort implements Sort {

    public void printArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[array.length - 1]);
    }

    public int[] sort(int[] intArr){
        int noOfBuckets = 5;
        int[] arr = intArr;
        List<Integer>[] buckets = new List[noOfBuckets];
        for(int i = 0; i < noOfBuckets; i++){
            buckets[i] = new LinkedList<>();
        }
        for(int num : arr){
            buckets[hash(num, noOfBuckets)].add(num);
        }
        for(List<Integer> bucket : buckets){
            Collections.sort(bucket);
        }
        int i = 0;
        for(List<Integer> bucket : buckets){
            for(int num : bucket){
                arr[i++] = num;
            }
        }
        return arr;
    }

    private static int hash(int num, int noOfBuckets){
        if (num < 0) {
            return 0;
        }
        if (num / 10 > noOfBuckets) {
            return noOfBuckets-1;
        }
        return num/10;
    }
}
