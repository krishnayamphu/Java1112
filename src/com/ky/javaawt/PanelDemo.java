package com.ky.javaawt;

import java.awt.*;

public class PanelDemo extends Frame {
    private Panel pnl;
    private TextField txtbox;
    private Button btnok;
    public PanelDemo(){
        pnl=new Panel();
        txtbox=new TextField(20);
        btnok=new Button("Button");

        pnl.setLayout(new FlowLayout());
        pnl.setBackground(Color.cyan);
        pnl.add(txtbox);
        pnl.add(btnok);

        add(pnl);
        setSize(300,200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new PanelDemo();
    }
}
