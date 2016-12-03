package com.john_pank.chapter13.task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Filosofia_Java
 * Created by John Pank on 19.08.2016.
 */
public class Orfografer {
    public static void main(String[] args) {
        String str = "Hello world.";
        Pattern p = Pattern.compile("[A-Z]{1}.+[.]");
        Matcher m = p.matcher(str);
        if(m.find())
            System.out.println("ok");
        else
            System.out.println("error!");
    }
}
