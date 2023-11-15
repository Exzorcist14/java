package ru.mirea.lab15.ex3;

public class MVCPatternGUI {
    public static void main(String[] args) {
        Student student = new Student();
        StudentView gui = new StudentView();
        StudentController controller = new StudentController(student, gui);
    }
}