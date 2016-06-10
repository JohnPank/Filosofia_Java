package com.john_pank.chapter9.task4;

/**
 * Filosofia_Java
 * Created by John Pank on 24.03.2016.
 */

abstract class BaseClass{

}

class ChildClass extends BaseClass{
    public static void show(BaseClass baseClass){
        System.out.println("Hernya text " + baseClass.toString());
    }
}

public class ClassRazvrat {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.show(new ChildClass());
    }

}
//ни хрена не понял:-( какое-то мутное задание