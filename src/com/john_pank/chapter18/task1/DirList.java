package com.john_pank.chapter18.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by JohnPank on 02.05.17.
 *
 */
public class DirList {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        long allSize = 0;
        if(args.length == 0)
            list = path.list();
        else
        list = path.list(new DirFilter(args[0]));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list){
            File tempFile = new File(dirItem);
            allSize += tempFile.length();

            System.out.println(dirItem);
        }
        System.out.println(allSize + " Bytes");
    }
}

class DirFilter implements FilenameFilter{
    private Pattern pattern;

    public DirFilter(String regex){
        pattern = Pattern.compile(regex);
    }

    public ArrayList<String> loadFile(String name) throws IOException {
        ArrayList <String> source = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(name)));
        String line;
        while((line = reader.readLine())!=null)
            source.add(line);
        reader.close();

        return source;
    }

    @Override
    public boolean accept(File dir, String name) {
        File temp = new File(name);
        if(temp.isDirectory() || !temp.exists())
            return false;
        ArrayList <String> fileContent = null;

        try {
            fileContent = loadFile(name);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(String line : fileContent){
            if(pattern.matcher(line).find())
                return true;
        }
        return false;
    }
}
