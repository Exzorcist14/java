package ru.mirea.lab15.ex3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
        view.addGenerateButtonListener(new GenerateButtonListener());
    }

    public void updateView() {
        view.updateView(model.getName(), model.getRollNo());
    }

    private class GenerateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            generateModelData();
            updateView();
        }
    }

    private void generateModelData() {
        Random random = new Random();
        model.setRollNo("Student: " + random.nextInt(1000));
        model.setName("RollNo: " + random.nextInt(10000));
    }
}