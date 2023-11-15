package ru.mirea.lab16.ex1;

public class Exception12 {
    public void exceptionDemo(){
        try {
            System.out.println(2/0);
        }
        catch (ArithmeticException e){
            System.out.println("Attempted division by zero");
        }
    }
}