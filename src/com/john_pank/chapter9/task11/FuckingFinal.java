package com.john_pank.chapter9.task11;

/**
 * Filosofia_Java
 * Created by John Pank on 25.03.2016.
 */

interface StringRotate{
    String work(String srcString);
}

class ChangeChar implements StringRotate{

    public String work(String srcString){
        char[] c = srcString.toCharArray();

        for (int i = 0; i < (c.length-1); i += 2)
        {
            char tmpChar = c[i];
            c[i] = c[i+1];
            c[i+1] = tmpChar;
        }

        String tmp = "";
        for (char ch : c)
        {
            tmp = tmp + ch;
        }

        return tmp;
    }

}

class WorkAtInterface{
    void func(StringRotate sr, String str){
        System.out.println(sr.work(str));
    }
}

public class FuckingFinal{
    public static void main(String[] args) {
        String str1 = "John_Pank";
        System.out.println(str1);
        new WorkAtInterface().func(new ChangeChar(),str1);
    }
}


