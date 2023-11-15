package ru.mirea.lab3;

public class TestBall {
    public static void main(String[] args) {
        Ball firstBall = new Ball();
        System.out.println(firstBall);

        Ball secondBall = new Ball(14, 14);
        System.out.println(secondBall);

        firstBall.setXY(7, 7);
        System.out.println(firstBall);

        System.out.println(secondBall.getX());

        secondBall.move(-7, 1);
        System.out.println(secondBall);
    }
}

