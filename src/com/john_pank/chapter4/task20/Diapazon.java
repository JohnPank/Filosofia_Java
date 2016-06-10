package com.john_pank.chapter4.task20;

/**
 * Filosofia_Java
 * Created by John Pank on 07.02.2016.
 */
public class Diapazon
{
    public static boolean test(int begin, int end, int target)
    {
        if (begin<=target & target<=end)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        System.out.println(test(10,20,15));
        System.out.println(test(10,20,3));
        System.out.println(test(10,20,25));
        System.out.println(test(10,20,10));
    }
}
