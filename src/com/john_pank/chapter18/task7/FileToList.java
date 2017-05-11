package com.john_pank.chapter18.task7;

import java.io.*;
import java.util.LinkedList;

/**
 * Filosofia_Java
 * Created by John Pank on 02.05.17.
 */
public class FileToList {

    public LinkedList<String> loadFile(String name) throws IOException {
        LinkedList <String> source = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(name)));
        String line;


        while((line = reader.readLine())!=null)
            source.add(line);
        reader.close();
        return source;
    }

    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
        int counter = 0;

        FileToList ftl = new FileToList();
        LinkedList <String> fileContent = ftl.loadFile("MoreText.txt");
        System.out.println(fileContent);
        while (fileContent.size() > 0){
            String temp = fileContent.removeLast();
            System.out.println(temp.toUpperCase());
            writer.println(counter++ + ": " + temp);
        }
        writer.flush();
        writer.close();
    }
}
