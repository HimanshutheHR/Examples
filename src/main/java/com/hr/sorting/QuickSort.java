package com.hr.sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        int capacity = 20;
        int[] arr = new int[capacity];
        Random random =  new Random();
        for(int i=0;i<capacity;i++){
            arr[i] = random.nextInt(100);
        }
        System.out.println("Unsorted array : " + Arrays.toString(arr));

        quickSort(arr, 0 , arr.length-1);
    }

    private static void quickSort(int[] arr, int low, int high) {

    }
}
