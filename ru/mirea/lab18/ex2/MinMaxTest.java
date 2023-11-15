package ru.mirea.lab18.ex2;

public class MinMaxTest {
    public static void main(String[] args) {
        Integer[] nums = {5, 1, 4, 10, 9};
        MinMax<Integer> minMax = new MinMax<>(nums);

        System.out.println(minMax.Min());
        System.out.println(minMax.Max());
    }
}
