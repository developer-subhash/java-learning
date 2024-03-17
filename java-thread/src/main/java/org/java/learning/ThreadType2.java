package org.java.learning;

public class ThreadType2 implements Runnable{
    @Override
    public void run() {
        System.out.println("this code is running in thread type 2");

        int i = 100000;
        while(i>0){
            i--;
        }

        System.out.println("thread 2 finished");
    }
}
