package com.john_pank.chapter20.annotationWorker;

import com.john_pank.chapter20.annotation.Calculator;
import com.john_pank.chapter20.annotation.SomeComment;

import java.lang.reflect.Method;

/**
 * Created by JohnPank on 29.05.17
 */

public class AnnotationWorker {
    public static void main(String[] args) {
        for (Method m : Calculator.class.getDeclaredMethods()){
            SomeComment someComment = m.getAnnotation(SomeComment.class);
            if(someComment != null){
                System.out.println(m.getName() + " com " + someComment.comment());
            }
        }
    }
}
