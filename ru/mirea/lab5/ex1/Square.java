package ru.mirea.lab5.ex1;

public class Square extends Rectangle {
    public Square() {
        super(14,14 );
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.length;
    }

    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        setSide(width);
    }

    @Override
    public void setLength(double side) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Square: " + "side = " + width + ", color = " + color + ", filled = " + filled;
    }
}
