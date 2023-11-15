package ru.mirea.lab13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceFileContent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для замены в файле:");
        String newText = scanner.nextLine();
        try (FileWriter writer = new FileWriter("lab13.txt")) {
            writer.write(newText);
        }

        catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}
