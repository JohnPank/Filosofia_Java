package com.john_pank.chapter18.task22;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Filosofia_Java
 * Created by John Pank on 03.05.17.
 */
public class OSExecute {
    public static void main(String[] args) {
        try{
            ProcessBuilder builder = new ProcessBuilder("ping");
            final Process process = builder.start();

            BufferedReader result = new BufferedReader(new InputStreamReader(process.getInputStream(),"Cp866"));
            String s;
            while ((s = result.readLine()) != null)
                System.out.println(s);


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
