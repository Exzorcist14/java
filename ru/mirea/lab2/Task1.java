package ru.mirea.lab2;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 5, 6, 9, 7, 8, 15, 14, 7, 22, 22, 44, 66, 88};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println(sum);

        sum = 0;
        int i = 0;
        while (i < array.length) {
            sum += array[i];
            i++;
        }

        System.out.println(sum);

        sum = 0;
        i = 0;
        do {
            sum += array[i];
            i++;
        } while (i < array.length);

        System.out.println(sum);
    }
}