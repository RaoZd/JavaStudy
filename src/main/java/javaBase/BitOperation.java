package javaBase;

/**
 * Created by rzd on 2017/4/20.
 */
public class BitOperation {
    public static void main(String[] args) {
        int tmp=75;
        for (;tmp!=0 ; tmp>>=1) {
            System.out.println(tmp&1);
        }
    }
}
