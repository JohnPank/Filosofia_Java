package com.john_pank.chapter7.task9;

/**
 * Filosofia_Java
 * Created by John Pank on 20.02.2016.
 */
class Root {
    Component1 cmp1;
    Component2 cmp2;
    Component3 cmp3;

    Root(int i)
    {
        System.out.println("Root created!");
        this.cmp1 = new Component1(i);
        this.cmp2 = new Component2(i);
        this.cmp3 = new Component3(i);
    }

    public void dispose(){

        cmp1.dispose();
        cmp2.dispose();
        cmp3.dispose();
        System.out.println("Root disposed");
    }

}
