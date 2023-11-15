package ru.mirea.lab6;

public class Mug extends Dish {
    private boolean presenceOfHandle;
    private int volume;

    public Mug(String material, String color, boolean filled, boolean presenceOfHandle, int volume) {
        super(material, color, filled);
        this.presenceOfHandle = presenceOfHandle;
        this.volume = volume;
    }

    public boolean isPresenceOfHandle() {
        return presenceOfHandle;
    }

    public void setPresenceOfHandle(boolean presenceOfHandle) {
        this.presenceOfHandle = presenceOfHandle;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void usageInfo() {
        System.out.println("Mug can be used for drinking hot or cold beverages");
        if (presenceOfHandle) {
            System.out.println("It has a handle for easy grip");
        } else {
            System.out.println("It does not have a handle");
        }
    }

    @Override
    public void characteristicsInfo() {
        System.out.println("Mug: material = " + material + ", " + ", color = " + color + ", filled = " + filled + ", presenceOfHandle = " +
                presenceOfHandle + ", volume = " + volume);
    }
}
