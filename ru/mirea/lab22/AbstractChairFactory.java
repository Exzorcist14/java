package ru.mirea.lab22;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair(int age);
    public MagicChair createMagicanChair();
    public FunctionalChair createFunctionalChair();
}
