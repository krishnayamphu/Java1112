package com.ky.multithreading;

import javax.swing.*;
import java.time.LocalTime;

public class DigitalClock extends JFrame implements Runnable {
    private JTextField txtbox;

    public DigitalClock() {
        txtbox = new JTextField(10);
        add(txtbox);
        pack();
        setVisible(true);
    }

    @Override
    public void run() {
        while (true) {
            try {
                LocalTime time = LocalTime.now();
                int h = time.getHour();
                int m = time.getMinute();
                int s = time.getSecond();
                String data = h + " : " + m + " : " + s;
                Thread.sleep(1000);
                txtbox.setText(data);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new DigitalClock());
        t.start();
    }
}
