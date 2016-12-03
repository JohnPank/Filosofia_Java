package com.john_pank.chapter10.task16;

/**
 * Filosofia_Java
 * Created by John Pank on 11.06.2016.
 */
interface StringRotate{
    String work(String srcString);
}


class WorkAtInterface{
    void func(StringRotate sr, String str){
        System.out.println(sr.work(str));
    }
}

class StringRotateFactory{
    StringRotate makeStringRotate(int opId){
        StringRotate sr = null;
        if (opId == 1)
            return new StringRotate(){
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
            };
        return sr;
    }
}

public class FuckingFinal{
    public static void main(String[] args) {
        String str1 = "John_Pank";
        System.out.println(str1);
        StringRotate sr = new StringRotateFactory().makeStringRotate(1);
        new WorkAtInterface().func(sr,str1);
    }
}

