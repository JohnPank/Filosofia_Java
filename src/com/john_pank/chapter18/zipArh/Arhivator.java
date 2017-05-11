package com.john_pank.chapter18.zipArh;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/**
 * Filosofia_Java
 * Created by John Pank on 05.05.17.
 */
public class Arhivator {

    public void zipper(String[] files, int level){
        try{
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("arhiv.zip"));
            zos.setLevel(level);
            BufferedOutputStream out = new BufferedOutputStream(zos);
            ZipEntry zipEntry;

            for(String fName : files){
                zipEntry = new ZipEntry(fName);
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(fName));
                zos.putNextEntry(zipEntry);
                int c;
                while ((c = in.read()) != -1)
                    out.write(c);
                in.close();
                out.flush();
            }
            zos.close();
            out.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void unzipper(){
        try {
            ZipFile zf = new ZipFile("arhiv.zip");
            ZipEntry zipEntry;
            Enumeration e = zf.entries();

            while (e.hasMoreElements()){
                zipEntry = (ZipEntry)e.nextElement();
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File("U"+zipEntry.getName())));
                InputStream in = zf.getInputStream(zipEntry);

                byte[] buffer = new byte[1024];
                int len;
                while ((len = in.read(buffer)) >= 0)
                    out.write(buffer, 0, len);
                out.close();
                in.close();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Arhivator arhivator = new Arhivator();
        arhivator.zipper(new String[]{"Data.txt", "Data2.txt", "Trolls.ser"}, 8);
        arhivator.unzipper();

    }
}
