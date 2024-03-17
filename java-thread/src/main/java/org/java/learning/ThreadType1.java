package org.java.learning;

public class ThreadType1 extends Thread{
    @Override
    public void run() {
        System.out.println("this code is running in thread type 1");

        int i = 100000;
        while(i>0){
            i--;
        }

        Main.amount++;
        System.out.println("amount after first thread increment " + Main.amount);

        System.out.println("thread 1 finished");
    }
}
