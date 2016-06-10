package com.john_pank.chapter5.task3;

/**
 * Filosofia_Java
 * Created by John Pank on 11.02.2016.
 */
public class Constructor {
    Constructor()
    {
        System.out.println("Конструктор по умолчанию");
    }

    Constructor(String str)
    {
        System.out.println("А это конструктор с параметром типа String=" + str);
    }
}

class Solution
{
    public static void main(String[] args) {
        Constructor temp = new Constructor();
        Constructor temp1 = new Constructor("Text kakoi-to");

    }
}
