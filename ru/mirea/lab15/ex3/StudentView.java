package ru.mirea.lab15.ex3;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;

public class StudentView extends JFrame {
    int WINDOW_WIDTH = 400;
    int WINDOW_HEIGHT = 200;
    JPanel panel;
    JLabel name;
    JLabel rollNo;
    JButton btn;

    StudentView() {
        super("Demonstration of the MVC pattern");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(200, 200);
        setLayout(new FlowLayout());

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        add(panel);
        addButton();
        addText();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
        setResizable(false);
    }

    private void addText() {
        name = new JLabel("Unknown");
        rollNo = new JLabel("Unknown");
        panel.add(name);
        panel.add(rollNo);
    }

    private void addButton() {
        btn = new JButton("Сhange a student");
        panel.add(btn);
    }

    public void updateView(String name, String rollNo) {
        this.name.setText(name);
        this.rollNo.setText(rollNo);
    }

    public void addGenerateButtonListener(ActionListener listener) {
        btn.addActionListener(listener);
    }
}