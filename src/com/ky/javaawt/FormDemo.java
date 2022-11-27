package com.ky.javaawt;
import java.awt.*;
public class FormDemo extends Frame {
    private Label lbldemo,lblname, lblcourse,lblgender, lblta, lblchoice;
    private TextField txtname;
    private Checkbox cbbasic, cbweb,cbmale,cbfemale;
    private CheckboxGroup ckbGender;
    private TextArea ta;
    private Choice country;
    private Button btnok;
    public FormDemo(){
        initComponents();
    }
    public void initComponents(){
        lbldemo=new Label("Java AWT Example");
        lblname=new Label("Name");
        lblcourse=new Label("Courses");
        lblgender=new Label("Gender");
        lblta=new Label("Textarea");
        lblchoice=new Label("Country");

        txtname=new TextField(20);
        cbbasic=new Checkbox("Basic",false);
        cbweb=new Checkbox("Web",false);
        ckbGender=new CheckboxGroup();
        cbmale=new Checkbox("Male",ckbGender,true);
        cbfemale=new Checkbox("Female",ckbGender, false);
        ta=new TextArea(5,10);
        country=new Choice();
        country.addItem("Nepal");
        country.addItem("China");
        country.addItem("India");
        btnok=new Button("Submit");

        add(lbldemo);
        add(lblname);
        add(txtname);

        add(lblcourse);
        add(cbbasic);
        add(cbweb);

        add(lblgender);
        add(cbmale);
        add(cbfemale);

        add(lblta);
        add(ta);

        add(lblchoice);
        add(country);

        add(btnok);

        setLayout(new FlowLayout());
        setSize(200,300);
    }
    public static void main(String[] args) {
        new FormDemo().setVisible(true);
    }
}
