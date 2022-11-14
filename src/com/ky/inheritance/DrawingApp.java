package com.ky.inheritance;

import java.awt.*;

public class DrawingApp {
    public static void main(String[] args) {
        /*Ractangle rect=new Ractangle();
        rect.draw("Rectangle");

        Traingle traingle=new Traingle();
        traingle.draw("Traingle");

        Circle circle=new Circle();
        circle.draw("Circle");

         */
        Shape circle=new Circle();
        Shape rectangle=new Ractangle();
        circle.draw("Circle");
        rectangle.draw("rectangle");
    }
}
