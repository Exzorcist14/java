package ru.mirea.lab18.ex2;

public class CalculatorTest {
    public static void main(String[] args) {
        int a = 5;
        double b = 2.5;

        double sumResult = Calculator.sum(a, b);
        System.out.println(sumResult);

        double multiplyResult = Calculator.multiply(a, b);
        System.out.println(multiplyResult);

        double divideResult = Calculator.divide(a, b);
        System.out.println(divideResult);

        double subtractionResult = Calculator.subtraction(a, b);
        System.out.println(subtractionResult);
    }
}
