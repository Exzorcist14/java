package ru.mirea.lab21;

public interface Queue<T> {
    public void enqueue(T t);
    public T element();
    public T dequeue();
    public int size();
    public boolean isEmpty();
    public void clear();
}