package com.ky.javaio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        File file=new File("demo.txt");
        try {
            BufferedWriter writer=new BufferedWriter(new FileWriter(file));
            writer.write("welcome to java programming");
            writer.flush();
            writer.close();
            System.out.println("data write success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
