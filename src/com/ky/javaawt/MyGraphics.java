package com.ky.javaawt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGraphics extends Frame {
    private Button btnRect;
    public MyGraphics(){
        btnRect=new Button("Draw");
        add(btnRect);
        btnRect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g=getGraphics();
                int[] x={50,150,50,100,150};
                int[] y={100,100,200,50,200};
                g.drawPolygon(x,y,5);

                g.drawRect(200,70,100,100);
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyGraphics();
    }
}
