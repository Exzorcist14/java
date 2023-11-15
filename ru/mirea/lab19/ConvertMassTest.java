package ru.mirea.lab19;

import java.util.List;

public class ConvertMassTest {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"a", "b", "c", "d", "e"};

        List<?> convertedIntList = ConvertMass.convertMassToList(intArray);
        System.out.println(convertedIntList);

        List<?> convertedStringList = ConvertMass.convertMassToList(stringArray);
        System.out.println(convertedStringList);
    }
}
