package com.hr;

import java.util.Arrays;
import java.util.Random;

public class Heaps {

    public static void main(String[] args) {
        Heaps heaps = new Heaps();
        Random random =  new Random();
        for(int i=0;i<20;i++){
            heaps.add(random.nextInt(100));
        }
        System.out.println(Arrays.toString(heaps.items));

        System.out.println("Heap sort: ");
        int[] arr = new int[20];
        for(int i=0;i<20;i++){
            arr[i] = heaps.poll();
        }
        System.out.println(Arrays.toString(arr));
    }

    private int capacity = 10;
    private int size = 0;

    int[] items = new int[capacity];

    private int getLeftChildIndex(int parentIndex){
        return 2*parentIndex+1;
    }
    private int getRightChildIndex(int parentIndex){
        return 2*parentIndex+2;
    }

    private int getParentIndex(int childIndex){
        return (childIndex-1)/2;
    }

    private boolean hasLeftChild(int parentIndex){
       return getLeftChildIndex(parentIndex)<size;
    }
    private boolean hasRightChild(int parentIndex){
        return getRightChildIndex(parentIndex)<size;
    }

    private boolean hasParent(int childIndex){
        return getParentIndex(childIndex)>=0;
    }

    private int leftChild(int index){
        return items[getLeftChildIndex(index)];
    }

    private int rightChild(int index){
        return items[getRightChildIndex(index)];
    }

    private int parent(int index){
        return items[getParentIndex(index)];
    }

    private void swap(int indexOne, int indexTwo){
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    private void ensureExtraCapacity(){
        if(size==capacity){
            items = Arrays.copyOf(items, capacity+10);
            capacity += 10;
        }
    }

    public int peek(){
        if(size==0){
            throw new IllegalArgumentException();
        }
        return items[0];
    }

    public int poll(){
        if(size==0){
            throw new IllegalArgumentException();
        }
        int item = items[0];
        items[0] = items[size-1];
        size--;
        heapifyDown();
        return item;
    }

    public void add(int item){
        ensureExtraCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    private void heapifyUp() {
        int index = size-1;

        while(hasParent(index) && parent(index)>items[index]){
            swap(index,getParentIndex(index));
            index = getParentIndex(index);
        }
    }

    private void heapifyDown() {
        int index = 0 ;

        while(hasLeftChild(index)){
            int smallerChildIndex = hasRightChild(index) && rightChild(index)<leftChild(index) ? getRightChildIndex(index) : getLeftChildIndex(index);
            if(items[index]>items[smallerChildIndex]){
                swap(index,smallerChildIndex);
                index = smallerChildIndex ;
            }else {
                break;
            }
        }
    }

}
