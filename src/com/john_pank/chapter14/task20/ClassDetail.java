package com.john_pank.chapter14.task20;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Filosofia_Java
 * Created by John Pank on 11.11.2016.
 */
public class ClassDetail {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class cl = Class.forName(args[0]);
            Constructor[] constructors =  cl.getConstructors();
            Field[] fields = cl.getFields();
            Method[] methods = cl.getMethods();

            System.out.println("Constructors------------------------");

            for (Constructor constr : constructors) {
                System.out.println(constr.getName());
            }

            System.out.println("Fields------------------------");

            for (Field field : fields) {
                System.out.println(field.getName());
            }

            System.out.println("Methods------------------------");

            for (Method method : methods) {
                System.out.println(method.getName() + "-----" +method.getGenericReturnType() );
            }

        }
        catch (ClassNotFoundException e){
            System.out.println("Class Not Found!!!");
            System.exit(1);
        }


    }
}
