package ru.mirea.lab16.ex5;

public class ThrowsDemo {
    public void getDetails(String key) {
        try {
            if(key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        }

        catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

