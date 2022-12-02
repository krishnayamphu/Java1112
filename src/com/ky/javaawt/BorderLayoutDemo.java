package com.ky.javaawt;

import java.awt.*;

public class BorderLayoutDemo extends Frame {
    private Button btn1,btn2,btn3,btn4,btn5;
    public BorderLayoutDemo(){
        BorderLayout bl=new BorderLayout();
        setLayout(bl);
        btn1=new Button("North");
        btn2=new Button("South");
        btn3=new Button("East");
        btn4=new Button("West");
        btn5=new Button("Center");

        add(btn1,BorderLayout.NORTH);
        add(btn2,BorderLayout.SOUTH);
        add(btn3,BorderLayout.EAST);
        add(btn4,BorderLayout.WEST);
        add(btn5,BorderLayout.CENTER);

        setSize(500,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }

}
