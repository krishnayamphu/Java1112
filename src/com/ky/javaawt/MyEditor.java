package com.ky.javaawt;

import javax.swing.colorchooser.ColorSelectionModel;
import java.awt.*;

public class MyEditor extends Frame {
    private Button btn1,btn2,btn3;
    private TextArea ta;
    private Panel panelTop;
    public MyEditor(){
        BorderLayout bl=new BorderLayout();
        setLayout(bl);
        btn1=new Button("Open");
        btn2=new Button("Save");
        btn3=new Button("Exit");
        ta=new TextArea(6,20);
        panelTop=new Panel();
        panelTop.setBackground(new Color(100,100,100));
        panelTop.setLayout(new FlowLayout());
        panelTop.add(btn1);
        panelTop.add(btn2);
        panelTop.add(btn3);

        add(panelTop,BorderLayout.NORTH);
        add(ta,BorderLayout.CENTER);
        setSize(500,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyEditor();
    }
}
