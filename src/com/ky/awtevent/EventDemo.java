package com.ky.awtevent;

import java.awt.*;
import java.awt.event.*;

public class EventDemo extends Frame {
    private Button btnok;
    public EventDemo(){
        btnok=new Button("Click Me");
        btnok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello World");
            }
        });
        btnok.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse entered successfully.");
            }
        });
        add(btnok);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(new FlowLayout());
        setSize(300,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new EventDemo();
    }
}
