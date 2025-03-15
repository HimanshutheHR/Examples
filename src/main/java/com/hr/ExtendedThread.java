package com.hr;

public class ExtendedThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("From the extended thread "+ Thread.currentThread().threadId());
    }
}
