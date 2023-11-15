package ru.mirea.lab16.ex8;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        boolean success = false;
        while (!success) {
            String key = myScanner.nextLine();
            printDetails(key);
            success = true;
        }
    }

    public void printDetails(String key) throws Exception {
            String message = getDetails(key);
            System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new RuntimeException("Key set to empty string");
        }
        return "data for " + key;
    }
}
