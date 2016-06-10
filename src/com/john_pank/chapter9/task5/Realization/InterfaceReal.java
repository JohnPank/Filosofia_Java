package com.john_pank.chapter9.task5.Realization;

import com.john_pank.chapter9.task5.Interfase.BaseInterface;

/**
 * Filosofia_Java
 * Created by John Pank on 24.03.2016.
 */
public class InterfaceReal implements BaseInterface {
    @Override
    public void method1() {
        System.out.println("Method 1");
    }
    @Override
    public void method2() {
        System.out.println("Method 2");
    }
    @Override
    public void method3() {
        System.out.println("Method 3");
    }
}

