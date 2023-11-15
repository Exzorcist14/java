package ru.mirea.lab9;

public class Car implements Nameable, Priceable
{
    private final String Name;
    private final int Price;

    public Car(String Name, int Price)
    {
        this.Name = Name;
        this.Price = Price;
    }

    @Override
    public String getName()
    {
        return Name;
    }

    @Override
    public int getPrice()
    {
        return Price;
    }
}
