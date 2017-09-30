package javaBase;

import java.util.LinkedList;

/**
 * Created by rzd on 2017/8/18.
 */
public class ThreadLocalTest {
    ThreadLocal local = new ThreadLocal();
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        for (String one : list) {
            System.out.println(one);
        }
    }
}
