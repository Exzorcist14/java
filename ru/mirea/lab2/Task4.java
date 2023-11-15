package ru.mirea.lab2;

import java.util.Random;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[14];

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        Arrays.sort(array);
        System.out.println();

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

}
