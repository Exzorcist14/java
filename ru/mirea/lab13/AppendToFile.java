package ru.mirea.lab13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для добавления в файл:");
        String textToAdd = scanner.nextLine();

        try (FileWriter writer = new FileWriter("lab13.txt")) {
            writer.append('\n');
            writer.append(textToAdd);
        }

        catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}
