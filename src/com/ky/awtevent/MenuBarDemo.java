package com.ky.awtevent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuBarDemo extends Frame {
    private MenuBar mb;
    private Menu mFile,mEdit;
    private MenuItem miopen,misave,micopy,mipaste;
    public MenuBarDemo(){
        init();
    }
    public void init(){
        mb=new MenuBar();
        mFile=new Menu("File");
        miopen=new MenuItem("Open");
        misave=new MenuItem("Save");
        mFile.add(miopen);
        miopen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Opening some file...");
            }
        });
        mFile.add(misave);

        mEdit=new Menu("Edit");
        micopy=new MenuItem("Copy");
        mipaste=new MenuItem("Paste");
        mEdit.add(micopy);
        mEdit.add(mipaste);
        mb.add(mFile);
        mb.add(mEdit);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setMenuBar(mb);
        setSize(300,250);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MenuBarDemo();
    }
}
