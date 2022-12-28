package com.ky.javaio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream stream=new FileOutputStream("test.txt");
            stream.write(97);
            stream.flush();
            stream.close();
            System.out.println("data write successfully.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
