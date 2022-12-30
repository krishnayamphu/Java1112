package com.ky.javaio;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        File file=new File("demo.txt");
        try {
            BufferedReader reader=new BufferedReader(new FileReader(file));
            int i=0;
            while((i=reader.read())!=-1){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
