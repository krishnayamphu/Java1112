package com.ky.javaio;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        //make directory (folder)
        File file=new File("doc");
        file.mkdir();
        System.out.println("Directory created");

        File f=new File(file+"/data.txt");
        try {
            f.createNewFile();
            System.out.println("file created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
