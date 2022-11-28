package com.ky.awtevent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventForm extends Frame {
    private TextField txtbox;
    private Button btn1, btn2;
    public EventForm(){
        txtbox=new TextField(20);
        add(txtbox);

        btn1=new Button("Get Text");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(txtbox.getText());
            }
        });
        add(btn1);

        btn2=new Button("Set Text");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtbox.setText("Welcome");
            }
        });
        add(btn2);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(new FlowLayout());
        setSize(200,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new EventForm();
    }
}
