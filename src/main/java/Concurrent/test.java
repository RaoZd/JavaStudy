package Concurrent;

import java.util.HashMap;

/**
 * Created by rzd on 2017/4/4.
 */
public class test {
    private static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(2,0.75f);
    public static void main(String[] args) {
        map.put(5, 55);

       Thread one= new Thread("Thread1") {
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                }
            };
        };
       one.setDaemon(true);
       one.start();
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        new Thread("Thread2") {
//            public void run() {
//                while (true) {
//                    System.out.println(Thread.currentThread().getName());
//                }
//            };
//        }.start();

    }
}
