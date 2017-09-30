package javaBase;

/**
 * Created by rzd on 2017/5/19.
 */
public class test {
    static int i;
    public static void main(String[] args) {
        Aa ab=new Ab();
        Ab bb=new Ab();
        bb.show();
        ab.show();
    }
}

class Aa
{
    int a=1;
    void show(){
        System.out.println(a);
    }
}

class Ab extends Aa
{
    void show(){
        System.out.println(a);
    }
}