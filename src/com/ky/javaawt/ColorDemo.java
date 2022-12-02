package com.ky.javaawt;

import java.awt.*;

public class ColorDemo extends Frame{
    private Label lbl1,lbl2;
    public ColorDemo(){
        lbl1=new Label("Welcome to Java AWT");
        lbl1.setForeground(Color.orange);
        lbl1.setFont(new Font("arial",Font.BOLD,20));

        lbl2=new Label("Java Programming");
        lbl2.setForeground(new Color(0,255,0));
        lbl2.setFont(new Font("arial",Font.BOLD,20));

        add(lbl1);
        add(lbl2);

        setSize(300,200);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorDemo();
    }
}
