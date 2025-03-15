package com.hr;

public class Main {
    public static void main(String[] args) {
        Thread newThread = new Thread(() ->
            System.out.println("new Thread " + Thread.currentThread().threadId())
        );
        ExtendedThread extendedThread = new ExtendedThread();
        extendedThread.start();
        newThread.start();
        System.out.println("Hello world Himanshu!  " + Thread.currentThread().threadId());
    }
}