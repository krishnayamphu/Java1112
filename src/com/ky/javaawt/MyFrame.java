package com.ky.javaawt;

import java.awt.*;

public class MyFrame extends Frame {
    public MyFrame(){
        add(new Button("Click Me"));

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(new Dimension(400,300));
        setTitle("MyFrame");
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
