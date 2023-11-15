package ru.mirea.lab5.ex2;

public class MovableRectangle {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString() {
        return "Rectangle:\n" + "Top left point:\n" + topLeft.toString() + "\nBottom right point:\n" + bottomRight.toString();
    }

    public boolean checkSpeed() {
        return (topLeft.xSpeed == bottomRight.xSpeed) && (topLeft.ySpeed == bottomRight.ySpeed);
    }

    public void moveUp() {
        if (checkSpeed()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    public void moveDown() {
        if (checkSpeed()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }

    public void moveLeft() {
        if (checkSpeed()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    public void moveRight() {
        if (checkSpeed()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }
}
