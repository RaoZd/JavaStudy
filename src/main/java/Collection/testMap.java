package Collection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by rzd on 2017/4/13.
 */
public class testMap {
    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();
        List<Object> list = new LinkedList<>();
        Integer a= (Integer) map.get("123");
        System.out.println(a);
        String s = (String) map.get("123");
        System.out.println(s);
        map.remove("123");
        list.remove("123");
    }
}
