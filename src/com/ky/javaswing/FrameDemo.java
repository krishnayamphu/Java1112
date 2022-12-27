package com.ky.javaswing;

import javax.swing.*;
import java.awt.*;

public class FrameDemo extends JFrame {
    private JButton btn;
    public FrameDemo(){
        btn=new JButton("Button");
        add(new JLabel("Welcome To Java Swing"));
        add(new JTextField(20));
        add(btn);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new FrameDemo();
    }
}
