package ru.mirea.lab5.ex2;

public class Test {
    public static void main(String[] args) {
        Movable point = new MovablePoint(7, 15, 8, 14);
        System.out.println(point);
        point.moveUp();
        point.moveRight();
        System.out.println(point);

        Movable circle = new MovableCircle(5, 1, 1, 8, 14);
        System.out.println(circle);
        point.moveDown();
        point.moveLeft();
        System.out.println(circle);

        MovableRectangle rectangle = new MovableRectangle(7, 8, 14, 15, 5, 8);
        System.out.println(rectangle);
        rectangle.moveUp();
        rectangle.moveRight();
        System.out.println(rectangle);
        System.out.println(rectangle.checkSpeed());
    }
}
