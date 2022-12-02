package com.ky.javaawt;

import java.awt.*;

public class GraphicsDemo extends Frame {
    public GraphicsDemo(){
        setSize(400,300);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
        g.fillRect(50,50,100,100);

        g.setColor(Color.red);
        g.drawOval(200,50,100,100);

        g.drawArc(50,200,100,100,0,45);
    }

    public static void main(String[] args) {
        new GraphicsDemo();
    }
}
