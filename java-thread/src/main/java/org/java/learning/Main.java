package org.java.learning;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mai thread start");
        // running thread 1
        ThreadType1 t1 = new ThreadType1();
        t1.start();

        // running thread 2
        Thread t2 = new Thread(new ThreadType2()); // pass object of 2nd thread
        t2.start();

        System.out.println("Main thread finished");
    }
}