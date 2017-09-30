package Concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by rzd on 2017/8/23.
 */
public class Main {
    static ReentrantLock lock;
    static int i;
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        LockSupport lockSupport;
        ReentrantLock reentrantLock;
        ThreadPoolExecutor threadPoolExecutor;


//        test0();

        lock = new ReentrantLock();
        Thread one = new TestThread3(lock);
        Thread two = new TestThread3(lock);
        one.start();
        two.start();

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(one.getState());
        System.out.println(two.getState());
    }
    static void test0() {
        Thread one = new Thread();
        one.start();
        one.interrupt();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(one.getState());
    }
}

class TestThread extends Thread{
    ReentrantLock lock;
    TestThread(ReentrantLock lock) {
        this.lock = lock;
    }
    public void run() {
        lock.lock();
        try {
            while (true) {
            }
        }finally {
            lock.unlock();
        }
    }
}

class TestThread2 extends Thread{
    ReentrantLock lock;
    TestThread2(ReentrantLock lock) {
        this.lock = lock;
    }
    public void run() {
        synchronized (lock) {
            while (true) {

            }
        }
    }
}

class TestThread3 extends Thread{
    ReentrantLock lock;
    TestThread3(ReentrantLock lock) {
        this.lock = lock;
    }
    public void run() {
        synchronized (lock) {
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}