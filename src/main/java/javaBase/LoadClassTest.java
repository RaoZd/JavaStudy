package javaBase;

/**
 * Created by rzd on 2017/8/19.
 */
public class LoadClassTest {
    public static void main(String[] args) {
        try {
            Class<?> cType2 = Class.forName("javaBase.Test");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Test{
    static {
        System.out.println("static block");
    }
    {
        System.out.println("dynamic block");
    }
}
