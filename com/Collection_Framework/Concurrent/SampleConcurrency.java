package com.Collection_Framework.Concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleConcurrency {
    public static void main(String[] args) {
        newCachedThreadPool();
    }

    static void newSingleThreadExecutor() {
        System.out.println("Running Executors.newSingleThreadExecutor()");
        ExecutorService singleThreadPool = Executors.newSingleThreadExecutor();
        singleThreadPool.execute(new Car());
        /* bike and boat will wait till car driving is completed. */
        singleThreadPool.execute(new Bike());
        singleThreadPool.execute(new Boat());
        /* make sure to shitdown. */
        singleThreadPool.shutdown();
    }

    static void newFixedThreadPool() {
        System.out.println("Running Executors.newFixedThreadPool(2)");
        ExecutorService fixedSizeThreadPool = Executors.newFixedThreadPool(2);
        fixedSizeThreadPool.execute(new Car());
        fixedSizeThreadPool.execute(new Bike());
        /*
         * this time Since threadpool only has 2 thread, Boat will wait till car driving
         * and bike riding is completed.
         */
        fixedSizeThreadPool.execute(new Boat());
        fixedSizeThreadPool.shutdown();
    }

    static void newCachedThreadPool(){
        System.out.println("Running Executors.newCachedThreadPool()");
        ExecutorService chachedThreadPool = Executors.newCachedThreadPool();
        chachedThreadPool.execute(new Car());
        chachedThreadPool.execute(new Bike());
        chachedThreadPool.execute(new Boat());
        chachedThreadPool.shutdown();
    }
}

class ThreadPool {
    static void print5Times(String statement) {
        for (int i = 0; i < 5; i++) {
            System.out.println(statement + " " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

class Car implements Runnable {
    @Override
    public void run() {
        ThreadPool.print5Times("I am driving a Car on road");
    }

}

class Bike implements Runnable {

    @Override
    public void run() {
        ThreadPool.print5Times("I am riding a Bike on road ");
    }
}

class Boat implements Runnable {
    @Override
    public void run() {
        ThreadPool.print5Times("I am Sailing the boat on sea ");
    }
}