package ru.mirea.lab9;

public class Castle implements Nameable, Priceable
{
    private final String Name;
    private final int Price;

    public Castle(String Name, int Price)
    {
        this.Name = Name;
        this.Price = Price;
    }

    public String getName()
    {
        return Name;
    }

    public int getPrice()
    {
        return Price;
    }
}
