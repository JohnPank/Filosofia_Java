package com.john_pank.chapter5.task17;

/**
 * Filosofia_Java
 * Created by John Pank on 13.02.2016.
 */
public class StrClassConst {
    StrClassConst(String str)
    {
        System.out.println(str);
    }
}

class ShowStrClass
{
    public static void main(String[] args) {
        StrClassConst[] scc = new StrClassConst[5];
        for (int i = 0; i<scc.length; i++)
        {
            scc[i] = new StrClassConst(Integer.toString(i));
            //System.out.println(scc[i]);
        }


    }
}
