package ru.mirea.lab6;

public class Test {
    public static void main(String[] args) {
        Mug mug = new Mug("Ceramic", "Blue", true, true, 300);
        Plate plate = new Plate("Glass", "White", false, 20, 5);
        ShortGlass glass = new ShortGlass("Glass", "Clear", true, 300);

        System.out.println("Mug Info:");
        mug.characteristicsInfo();
        System.out.println("Usage Info for mug:");
        mug.usageInfo();

        System.out.println("\nPlate Info:");
        plate.characteristicsInfo();
        System.out.println("Usage Info for plate:");
        plate.usageInfo();

        System.out.println("\nShort glass Info:");
        glass.characteristicsInfo();
        System.out.println("Usage Info for Short glass:");
        glass.usageInfo();

        mug.setVolume(400);
        plate.setFilled(true);
        glass.setVolume(100);

        System.out.println("\nUpdated Mug Info:");
        mug.characteristicsInfo();

        System.out.println("\nUpdated Plate Info:");
        plate.characteristicsInfo();

        System.out.println("\nUpdated Short glass Info:");
        plate.characteristicsInfo();
    }
}
