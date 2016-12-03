package com.john_pank.chapter13.task15;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Filosofia_Java
 * Created by John Pank on 05.09.2016.
 */
public class JGrep {

    private ArrayList<String> readFile(String fileName){
        ArrayList<String> result = new ArrayList<>();
        String str;
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            while ((str = reader.readLine()) != null){
                result.add(str);
            }
        }
        catch (Exception e){
            System.out.println("Error in file opener!");
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        JGrep jg = new JGrep();
        ArrayList<String> list;
        int index = 0;

        if(args.length < 2){
            System.out.println("Arguments error!");
            System.exit(0);
        }
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        int flag = 0;
        list = jg.readFile(args[0]);

        switch (args[2]){
            case "Pattern.CANON_EQ": flag = Pattern.CANON_EQ; break;
            case "Pattern.CASE_INSENSITIVE": flag = Pattern.CASE_INSENSITIVE; break;
            case "Pattern.COMMENTS": flag = Pattern.COMMENTS; break;
            case "Pattern.MULTILINE": flag = Pattern.MULTILINE; break;
            case "Pattern.UNICODE_CASE": flag = Pattern.UNICODE_CASE; break;
            case "Pattern.UNIX_LINES": flag = Pattern.UNIX_LINES; break;
        }



        Pattern p = Pattern.compile(args[1], flag);
        Matcher m = p.matcher("");
        for (String line : list){
            //System.out.println(line);
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " + m.group() + ": " + m.start());

        }
    }
}
