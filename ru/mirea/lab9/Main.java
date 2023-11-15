package ru.mirea.lab9;

public class Main  {
    public static void main(String[] args) {
        Castle doll = new Castle("Мариенбург", 250000000);
        Car car = new Car("Митсубиши", 1500000);
        Laptop laptop = new Laptop("HP Omen", 140000);

        System.out.println(doll.getName() + ", стоимость = " + doll.getPrice());
        System.out.println(car.getName() + ", стоимость = " + car.getPrice());
        System.out.println(laptop.getName() + ", стоимость = " + laptop.getPrice());
    }
}
