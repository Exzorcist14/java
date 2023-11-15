package ru.mirea.lab20.ex2;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator model = new Calculator();
        CalculatorController controller = new CalculatorController(model);
    }
}
