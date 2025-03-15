package com.hr.sorting;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;

public class HeapSort {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq  =  new PriorityQueue<>();

        Random random =  new Random();
        for(int i=0;i<20;i++){
            pq.add(random.nextInt(100));
        }
        System.out.println(pq);

        System.out.println("Heap sort: ");
        int[] arr = new int[20];
        for(int i=0;i<20;i++){
            arr[i] = pq.poll();
        }
        System.out.println(Arrays.toString(arr));
    }
}
