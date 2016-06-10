package com.john_pank.chapter5.task2;

/**
 * Filosofia_Java
 * Created by John Pank on 11.02.2016.
 */
public class DoubleStringClass {
    String str1 = "text1";
    String str2;

    DoubleStringClass()
    {
        str2 = "text2";
    }

}

class Solution
{
    public static void main(String[] args) {
        DoubleStringClass stringClass = new DoubleStringClass();
        System.out.println(stringClass.str1);
        System.out.println(stringClass.str2);
    }
}
