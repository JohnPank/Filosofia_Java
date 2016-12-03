package com.john_pank.chapter13.task16;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Filosofia_Java
 * Created by John Pank on 13.09.2016.
 */
public class JGrepMultiFile {
    public String[] fileListCreator(File dir){
        String[] fileList = dir.list();
        return fileList;
    }

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

        if(args.length < 2){
            System.out.println("Arguments error!");
            System.exit(0);
        }

        JGrepMultiFile jgmf = new JGrepMultiFile();
        ArrayList<String> fileContains;
        int index = 0;

        //System.out.println(args[0]);


        File dir = new File(args[0]);
        String[] fileList = jgmf.fileListCreator(dir);

        /*****************************************************************************/
        for (String fileName : fileList)
            System.out.println(fileName);
        System.out.println("****************************");
        System.out.println();

        for (String fileName : fileList) {
            fileContains = jgmf.readFile(args[0] + "\\" + fileName);

            Pattern p = Pattern.compile(args[1]);
            Matcher m = p.matcher("");
            System.out.println(fileName);
            for (String line : fileContains){
                //System.out.println(line);
                m.reset(line);
                while (m.find())
                    System.out.println(index++ + ": " + m.group() + ": " + m.start());

            }
        }
    }
}
