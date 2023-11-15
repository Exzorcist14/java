package ru.mirea.lab11.ex2;

import java.util.Comparator;

class SortingStudentsByGPADesc implements Comparator<Student> {
    @Override
    public int compare(Student left, Student right) {
        return Double.compare(right.GPA, left.GPA);
    }
}

public class Main {
    public static void quickSort(Student[] arr, int left, int right, SortingStudentsByGPADesc comparator) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right, comparator);
            quickSort(arr, left, pivotIndex - 1, comparator);
            quickSort(arr, pivotIndex + 1, right, comparator);
        }
    }

    private static int partition(Student[] arr, int left, int right, SortingStudentsByGPADesc comparator) {
        Student pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (comparator.compare(arr[j], pivot) <= 0) {
                i++;
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Student temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Vladimir", 3.5),
                new Student("Alyona", 4.0),
                new Student("Margarita", 3.2),
                new Student("Nail", 3.9)
        };

        for (Student student : students)  {
            System.out.print(student.GPA + " ");
        }

        SortingStudentsByGPADesc comparator = new SortingStudentsByGPADesc();
        quickSort(students, 0, students.length - 1, comparator);

        System.out.println();
        for (Student student : students) {
            System.out.print(student.GPA + " ");
        }
    }
}
