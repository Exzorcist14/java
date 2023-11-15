package ru.mirea.lab22;

public class Client {
    public Chair chair;

    public void sit() {
        System.out.println("Sat down");
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
