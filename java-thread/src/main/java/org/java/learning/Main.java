package org.java.learning;

public class Main {
    public static int amount = 0; // it's static variable so it is a shared variable and all threads can access, concurrency issue
    public static void main(String[] args) {
        System.out.println("Mai thread start");
        amount++;
        System.out.println("amount after main thread first increment " + amount);
        // running thread 1
        ThreadType1 t1 = new ThreadType1();
        t1.start();

        // running thread 2
        Thread t2 = new Thread(new ThreadType2()); // pass object of 2nd thread
        t2.start();

        // sorting concurrency issue
        while(t1.isAlive() || t2.isAlive()){
            System.out.println("main thread is now waiting for completion of t1 and t2 thread");
        }

        System.out.println("both t1 and t2 thread finished");

        amount++;
        System.out.println("amount after main thread 2nd increment " + amount);

        amount++;
        System.out.println("amount after main thread 3rd increment " + amount);

        System.out.println("Main thread finished");
    }
}