package com.ky.javaio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        File file=new File("data.txt");
        try {
            file.createNewFile();
            FileWriter writer=new FileWriter(file);
            writer.write("Hello java world");
            writer.flush();
            writer.close();
            System.out.println("data write successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
