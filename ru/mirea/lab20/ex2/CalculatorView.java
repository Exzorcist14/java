package ru.mirea.lab20.ex2;

public class CalculatorView implements View {
    public void printResult(String result) {
        System.out.printf("%s\n", result);
    }

    public void printException(Exception e) {
        System.out.printf("%s\n", e.toString());
    }
}