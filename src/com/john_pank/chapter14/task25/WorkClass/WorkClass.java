package com.john_pank.chapter14.task25.WorkClass;
import com.john_pank.chapter14.task25.TestClass.TestClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Filosofia_Java
 * Created by John Pank on 10.12.2016.
 */
public class WorkClass {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestClass tc = new TestClass();
        Class tClass = tc.getClass();
        Method[] methods = tClass.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method.getName());
            method.setAccessible(true);
            method.invoke(tc);
        }
    }
}
