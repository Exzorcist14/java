package ru.mirea.lab2;

import java.util.Scanner;

public class Task5 {
    public static int fact(int x) {
        int ans = 1;
        for (int i = 2; i <= x; i++) {
            ans *= i;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(fact(x));
    }
}
