package ru.mirea.lab18.ex1;

public class GenericClassTest {
    public static void main(String[] args) {
        GenericClass<String, Animal, Double> generic = new GenericClass<>("Привет!", new Animal(), 3.14);
        generic.printClasses();

        generic.setT("Это демонстрация работы дженериков");
        System.out.println(generic.getT());

        System.out.println(generic.getK());
    }
}
