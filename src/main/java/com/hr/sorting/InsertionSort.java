package com.hr.sorting;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {
        System.out.println("Insertion Sort");
        int capacity = 30;
        int[] arr = new int[capacity];
        Random random =  new Random();
        for(int i=0;i<capacity;i++){
            arr[i] = random.nextInt(100);
        }
        System.out.println("Unsorted array : " + Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("Sorted array : " + Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {

        for(int i=1;i<arr.length;i++){
            int num = arr[i];
            int pos = i;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>num){
                    arr[j+1]=arr[j];
                    pos = j ;
                }else{
                    break;
                }
            }
            arr[pos] = num;
        }
    }
}
