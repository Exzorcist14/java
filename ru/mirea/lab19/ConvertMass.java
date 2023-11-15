package ru.mirea.lab19;

import java.util.ArrayList;
import java.util.List;

public class ConvertMass {
    public static List<?> convertMassToList(Integer[] lst) {
        List<Integer> l = new ArrayList<>();

        for (Integer o: lst) {
            l.add(o);
        }

        return l;
    }

    public static List<?> convertMassToList(String[] lst) {
        List<String> l = new ArrayList<>();

        for (String o: lst) {
            l.add(o);
        }

        return l;
    }
}