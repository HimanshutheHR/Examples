package com.hr.sorting;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    public static void main(String[] args) {
        System.out.println("Merge Sort");
        int capacity = 20;
        int[] arr = new int[capacity];
        Random random =  new Random();
        for(int i=0;i<capacity;i++){
            arr[i] = random.nextInt(100);
        }
        System.out.println("Unsorted array : " + Arrays.toString(arr));

        mergeSort(arr);

        System.out.println("Sorted array : " + Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {

        if(arr.length<=1){
            return;
        }

        int mid = arr.length/2;
        int[] left = new int[mid];
        int[] right= new int[arr.length-mid];

        for(int i=0; i<mid;i++){
            left[i] = arr[i];
        }
        for(int i=mid;i<arr.length;i++){
            right[i-mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(arr, left,right);

    }

    private static void merge(int[] arr, int[] left, int[] right) {

        int i = 0 ;
        int j = 0;
        int k = 0;
        while(i<left.length && j<right.length){

            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }else{
                arr[k]=right[j];
                j++;
                k++;
            }
        }

        while(i<left.length){
            arr[k++]=left[i++];
        }
        while(j<right.length){
            arr[k++]=right[j++];
        }
    }
}
