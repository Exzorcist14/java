package ru.mirea.lab16.ex6;

public class ThrowsDemoTest {
    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        String key = null;
        demo.printMessage(key);

        key = "15";
        demo.printMessage(key);
    }
}
