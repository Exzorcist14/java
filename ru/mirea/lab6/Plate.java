package ru.mirea.lab6;

public class Plate extends Dish {
    private int diameter;
    private int height;

    public Plate(String material, String color, boolean filled, int diameter, int height) {
        super(material, color, filled);
        this.diameter = diameter;
        this.height = height;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void usageInfo() {
        System.out.println("Plate can be used for serving food.");
        System.out.println("It is typically used to hold and present food items.");
    }

    @Override
    public void characteristicsInfo() {
        System.out.println("Mug: material = " + material + ", " + ", color = " + color + ", filled = " + filled + ", diameter = " +
                diameter + ", height = " + height);
    }
}
