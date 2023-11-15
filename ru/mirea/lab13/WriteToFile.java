package ru.mirea.lab13;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для записи в файл:");
        String text = scanner.nextLine();

        try (FileWriter writer = new FileWriter("lab13.txt")) {
            writer.write(text);
        }

        catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}

