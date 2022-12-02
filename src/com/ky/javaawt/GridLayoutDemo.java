package com.ky.javaawt;

import java.awt.*;

public class GridLayoutDemo extends Frame {
    private Button btn1,btn2,btn3,btn4,btn5,btn6;
    public GridLayoutDemo(){
        GridLayout gl=new GridLayout(3,2);
        setLayout(gl);
        btn1=new Button(" 1 ");
        btn2=new Button(" 2 ");
        btn3=new Button(" 3 ");
        btn4=new Button(" 4 ");
        btn5=new Button(" 5 ");
        btn6=new Button(" 6 ");
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        setSize(200,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
