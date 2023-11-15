package ru.mirea.lab16.ex7;

import java.util.Scanner;

public class ThrowsDemo1 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);

        try {
            String key = myScanner.next();
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        }

        catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    private String getDetails(String key) throws Exception {
        if (key == null) {
            throw new Exception("Key set to empty string");
        }

        return "data for " + key;
    }
}
