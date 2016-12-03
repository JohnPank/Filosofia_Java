package com.john_pank.chapter13.task10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Filosofia_Java
 * Created by John Pank on 19.08.2016.
 */
public class TestRegexp {
    public static void main(String[] args) {
        String str = "Java now has regular expressions";
        Pattern p = Pattern.compile("n.w\\s+h(a|i)s");
        Matcher m = p.matcher(str);
        if(m.find())
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
