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

        quickSort(arr);

        System.out.println("Sorted array : " + Arrays.toString(arr));
    }

    private static void quickSort(int[] arr) {
        quickSort(arr,0, arr.length-1);
    }


    private static void quickSort(int[] arr, int low, int high) {

        if(low>=high){
            return;
        }

        int pivotIndex = new Random().nextInt(high-low)+low;
        int pivot = arr[pivotIndex];
        swap(arr,pivotIndex,high);
        int left = low;
        int right = high;

        while(left<right){

            while(left<right && arr[left]<=pivot){
                left++;
            }
            while(left<right && arr[right]>=pivot){
                right--;
            }
            swap(arr, left ,right);
        }
        swap(arr, left, high);

        quickSort(arr, 0 , left-1);
        quickSort(arr, left+1 , high);

    }

    private static void swap(int[] arr, int indexOne, int indexTwo) {
            int temp = arr[indexOne];
            arr[indexOne] = arr[indexTwo];
            arr[indexTwo] = temp;
    }


}
