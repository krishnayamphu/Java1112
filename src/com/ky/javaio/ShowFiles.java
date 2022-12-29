package com.ky.javaio;

import java.io.File;

public class ShowFiles {
    public static void main(String[] args) {
        File file=new File("doc");
        System.out.println(file.isDirectory());
        File[] files=file.listFiles();
        for(File f:files){
            System.out.println(f.getName());
        }
    }
}
