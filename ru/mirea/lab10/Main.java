package ru.mirea.lab10;

import java.util.Scanner;

public class Main {
    //Упражнение 1
    public static void triangle(int n, int curr, int p) {
        if (p == n) {
            return;
        }

        int i = 0;
        while ((p < n) && (i < curr))  {
            System.out.print(curr + " ");
            i++;
            p++;
        }

        triangle(n, ++curr, p);
    }

    //Упражнение 2
    public static void sequence(int n) {
        if (n == 0) {
            return;
        }

        sequence(n - 1);
        System.out.println(n);
    }

    //Упражнение 3
    public static void orderedSequence(int A, int B) {
        if (B < A) {
            return;
        }

        orderedSequence(A, B - 1);
        System.out.println(B);
    }

    //Упражнение 4
    public static int countNumbers(int k, int s) {
        if (k == 1) {
            if (s >= 0 && s <= 9) {
                return 1;
            } else {
                return 0;
            }
        }

        int count = 0;
        for (int i = 1; i <= 9; i++) {
            if (s - i >= 0) {
                count += countNumbers(k - 1, s - i);
            }
        }

        return count;
    }

    //Упражнение 5
    public static int sumDigits(int N) {
        if (N >= 0 && N <= 9) {
            return N;
        }

        return sumDigits(N / 10) + (N % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ch;
        System.out.println("Введите номер упражнения: ");
        ch = scanner.nextInt();

        int n;
        switch (ch) {
            case 1:
                System.out.println("Введите число: ");
                n = scanner.nextInt();
                triangle(n, 0, 0);

                break;
            case 2:
                System.out.println("Введите число: ");
                n = scanner.nextInt();
                sequence(n);

                break;
            case 3:
                System.out.println("Введите число A: ");
                int A = scanner.nextInt();
                System.out.println("Введите число B: ");
                int B = scanner.nextInt();

                if (A > B) {
                    orderedSequence(B, A);
                }

                else {
                    orderedSequence(A, B);
                }

                break;
            case 4:
                System.out.println("Введите число k: ");
                int k = scanner.nextInt();
                System.out.println("Введите число s: ");
                int s = scanner.nextInt();
                System.out.println(countNumbers(k, s));

                break;
            case 5:
                System.out.println("Введите число N: ");
                n = scanner.nextInt();

                System.out.println(sumDigits(n));
        }


    }
}
