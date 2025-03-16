package com.hr.sorting;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {
        System.out.println("Selection Sort");
        int capacity = 30;
        int[] arr = new int[capacity];
        Random random =  new Random();
        for(int i=0;i<capacity;i++){
            arr[i] = random.nextInt(100);
        }
        System.out.println("Unsorted array : " + Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("Sorted array : " + Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {

        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            int min = arr[minIndex];
            for(int j=i+1;j<arr.length;j++){
                if(min>arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            swap(arr, i , minIndex);
        }
    }

    private static void swap(int[] arr, int indexOne, int indexTwo) {
        int temp = arr[indexOne];
        arr[indexOne] = arr[indexTwo];
        arr[indexTwo] = temp;
    }
}
