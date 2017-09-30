package Collection;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by rzd on 2017/4/17.
 */
public class testList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer integer : list) {
            list.remove(integer);
        }
    }
}
