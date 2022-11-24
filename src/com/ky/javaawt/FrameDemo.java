package com.ky.javaawt;

import java.awt.*;

public class FrameDemo {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setLayout(new FlowLayout());
        f.setSize(400,300);
        f.setTitle("Frame Example");
        f.add(new Button("Button"));
        f.setResizable(false);
        f.setVisible(true);
    }
}
