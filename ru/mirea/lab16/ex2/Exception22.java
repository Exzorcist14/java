package ru.mirea.lab16.ex2;

import java.util.Scanner;

public class Exception22 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        String intString = myScanner.next();

        try{
            int i = Integer.parseInt(intString);
            System.out.println(2/i);
        }

//        catch (Exception e){
//            System.out.println("Wrong");
//        }

        catch (NumberFormatException e){
            System.out.println("Wrong format of integer");
        }
        catch (ArithmeticException e){
            System.out.println("division by zero");
        }
    }
}
