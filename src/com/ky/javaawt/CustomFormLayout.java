package com.ky.javaawt;

import java.awt.*;

public class CustomFormLayout extends Frame {
    private Label lblname, lblpassword;
    private TextField txtuser, txtpassword;
    private Button btnlogin;

    public CustomFormLayout() {
        init();
    }

    public void init() {
        lblname=new Label("Username");
        lblname.setBounds(30,50,70,30);
        add(lblname);

        txtuser=new TextField();
        txtuser.setBounds(120,50,200,30);
        add(txtuser);

        lblpassword=new Label("Password");
        lblpassword.setBounds(30,100,70,30);
        add(lblpassword);

        txtpassword=new TextField();
        txtpassword.setBounds(120,100,200,30);
        add(txtpassword);

        btnlogin=new Button("Login");
        btnlogin.setBounds(120,150,100,30);
        add(btnlogin);

        setLayout(null);
        setSize(350,200);
        setResizable(false);
        setTitle("User Login");

    }

    public static void main(String[] args) {
        new CustomFormLayout().setVisible(true);
    }
}
