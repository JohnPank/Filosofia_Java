package com.john_pank.chapter13.task18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Filosofia_Java
 * Created by John Pank on 21.09.2016.
 */
public class LiteralFinder{
    //comment
    //чтение файла
    private ArrayList<String> readFile(String fileName){
        ArrayList<String> result = new ArrayList<>();
        String str;
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            while ((str = reader.readLine()) != null){
                result.add(str);
            }
            reader.close();
        }
        catch (Exception e){
            //System.out.println(fileName + " Error in file opener!");
            System.out.println(e.getMessage());
        }
        return result;
    }

    public static void main(String[] args) {
        LiteralFinder lf = new LiteralFinder();
        ArrayList<String> fileContains = new ArrayList<>();
        fileContains = lf.readFile(args[0]);

        Pattern p = Pattern.compile("\".+\"");
        Matcher m = p.matcher("");

        for (String line : fileContains) {
            //System.out.println(line);
            m.reset(line);
            while (m.find())
                System.out.println(m.group());
        }
    }
}
