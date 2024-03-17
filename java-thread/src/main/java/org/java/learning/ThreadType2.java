package org.java.learning;

public class ThreadType2 implements Runnable{
    @Override
    public void run() {
        System.out.println("this code is running in thread type 2");

        Main.amount++;
        System.out.println("amount after 2nd thread increment " + Main.amount);

        int i = 100000;
        while(i>0){
            i--;
        }

        System.out.println("thread 2 finished");
    }
}
