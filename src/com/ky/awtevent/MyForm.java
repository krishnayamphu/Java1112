package com.ky.awtevent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm extends Frame implements ActionListener {
    private Button btn;
    public MyForm(){
        init();
    }

    public void init() {
        btn=new Button("Click Me");
        btn.addActionListener(this);
        add(btn);
        setLayout(new FlowLayout());
        setSize(400,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            //System.out.println("Okay !, Button is pressed.");
            System.exit(0);
        }
    }
}
