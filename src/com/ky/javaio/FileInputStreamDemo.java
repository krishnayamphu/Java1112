package com.ky.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream stream=new FileInputStream("test.txt");
            int data=0;
            while((data=stream.read())!=-1){
                System.out.print((char)data);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
