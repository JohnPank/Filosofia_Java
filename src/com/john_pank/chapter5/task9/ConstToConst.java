package com.john_pank.chapter5.task9;

/**
 * Filosofia_Java
 * Created by John Pank on 12.02.2016.
 */
public class ConstToConst {

    int i;
    String str;

    ConstToConst(int i)
    {
        this.i = i;
    }

    ConstToConst(String str, int i)
    {
        this(i);
        this.str = str;
    }

    public void print()
    {
        System.out.println(i);
        System.out.println(str);
    }

    public static void main(String[] args) {
        ConstToConst ctc1 = new ConstToConst(5);
        ConstToConst ctc2 = new ConstToConst("Pease", 5);

        ctc1.print();
        ctc2.print();
    }

}
