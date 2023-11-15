package ru.mirea.lab11.ex1;

public class Main {
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++)
        {
            Student main = students[i];
            int j = i;

            while (j > 0 && students[j - 1].iDNumber > main.iDNumber)
            {
                students[j] = students[j - 1];
                j -= 1;
            }

            students[j] = main;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Vladimir", 3),
                new Student("Alyona", 1),
                new Student("Andrei", 2),
                new Student("Leonid", 4)
        };

        for (Student student : students) {
            System.out.print(student.iDNumber + " ");
        }

        insertionSort(students);
        System.out.println();

        for (Student student : students) {
            System.out.print(student.iDNumber + " ");
        }
    }
}
