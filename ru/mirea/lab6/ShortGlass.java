package ru.mirea.lab6;

public class ShortGlass extends Dish {
    private int volume;

    public ShortGlass(String material, String color, boolean filled, int volume) {
        super(material, color, filled);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int capacity) {
        this.volume = capacity;
    }

    @Override
    public void characteristicsInfo() {
        System.out.println("Glass: material = " + material + ", color = " + color + ", filled = " + filled + ", capacity = " + volume + " ml");
    }

    @Override
    public void usageInfo() {
        System.out.println("Glass is used for drinking beverages");
    }
}