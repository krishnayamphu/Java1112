package com.ky.javaio;

import javax.swing.*;
import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file=new File("doc/data.txt");
        if(file.delete()){
            JOptionPane.showMessageDialog(null,"File deleted");
        }else{
            JOptionPane.showMessageDialog(null,"File not found");
        }
    }
}
