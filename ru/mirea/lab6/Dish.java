package ru.mirea.lab6;

public abstract class Dish {
    protected String material;
    protected String color;
    protected boolean filled;

    public Dish(String material, String color, boolean filled) {
        this.material = material;
        this.color = color;
        this.filled = filled;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract void usageInfo();

    public abstract void characteristicsInfo();
}
