package javaBase;

/**
 * Created by rzd on 2017/4/12.
 */
public class InitTest {
    static {
        System.out.println("main");
    }

    public static void main(String[] args) {
      A a=new B();
    }
}

class A
{
    {
        System.out.println("a");
    }
    static
    {
        System.out.println("A");
    }

    public A() {
        System.out.println("consA");
        show();
    }
    public void show()
    {
        System.out.println("showA");
    }
}

class B extends A {
    {
        System.out.println("b");
    }
    static
    {
        System.out.println("B");
    }

    public B() {
        System.out.println("consB");

    }
    public void show()
    {
        System.out.println("showB");
    }
}