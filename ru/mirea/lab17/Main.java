package ru.mirea.lab17;

import javax.print.attribute.standard.OrientationRequested;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean flag = true;

        Order order;
        String fullname;
        String INN;

        while (flag) {
            System.out.println("1. Example without Exceptions.");
            System.out.println("2. Example with INNException.");
            System.out.println("3. Example with NameException.");
            System.out.println("0. Exit.");
            System.out.println();

            System.out.print("Enter command number: ");
            number = scanner.nextInt();

            switch (number) {
                case 1:
                    order = new Order();
                    fullname = "Namestnikov V.N.";
                    INN = "146459786721";

                    System.out.println("Fullname: " + fullname);
                    System.out.println("INN: " + INN);

                    try {
                        order.setClientFullName(fullname);
                        order.setClientINN(INN);

                        System.out.println(order);
                    }

                    catch (INNIsNotCorrectException exception) {
                        System.out.println("Problems with INN");
                    }
                    catch (FullnameIsNotCorrectException exception) {
                        System.out.println("Problems with Fullname");
                    }

                    System.out.println();

                    break;
                case 2:
                    order = new Order();
                    fullname = "Namestnikov V.N.";
                    INN = "0123456789";

                    System.out.println("Fullname: " + fullname);
                    System.out.println("INN: " + INN);

                    try {
                        order.setClientINN(INN);
                        order.setClientFullName(fullname);

                        System.out.println(order);

                    }

                    catch (INNIsNotCorrectException exception) {
                        System.out.println("Problems with INN");
                    }

                    catch (FullnameIsNotCorrectException exception) {
                        System.out.println("Problems with Fullname");
                    }

                    System.out.println();

                    break;
                case 3:
                    order = new Order();
                    fullname = "Namestnikov Vladimir";
                    INN = "146459786721";

                    System.out.println("Fullname: " + fullname);
                    System.out.println("INN: " + INN);

                    try {
                        order.setClientINN(INN);
                        order.setClientFullName(fullname);

                        System.out.println(order);

                    }

                    catch (INNIsNotCorrectException exception) {
                        System.out.println("Problems with INN");
                    }

                    catch (FullnameIsNotCorrectException exception) {
                        System.out.println("Problems with Fullname");
                    }

                    System.out.println();

                    break;
                case 0:
                    flag = false;
                    break;
            }
        }
    }
}