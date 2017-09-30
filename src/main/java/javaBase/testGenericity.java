package javaBase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rzd on 2017/4/18.
 */
public class testGenericity {
    public static void main(String[] args) {
        List<A> list = new ArrayList<>();
        show(list);
    }
    static void show( List<? super A> list)
    {

    }
}
