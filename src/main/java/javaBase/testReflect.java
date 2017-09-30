package javaBase;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by rzd on 2017/4/18.
 */
public class testReflect {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        privateClass p=new privateClass();
        Class<?> classtype=p.getClass();
        Method method = classtype.getDeclaredMethod("show", new Class[]{String.class});
        method.setAccessible(true);
        method.invoke(p, new Object[]{"zhangsan"});
    }
}

class privateClass
{
    private void show(String s) {
        System.out.println(s);
    }
}
