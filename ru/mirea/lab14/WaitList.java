package ru.mirea.lab14;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;


public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content;

    /**
     * Конструктор по умолчанию для списка ожидания.
     */
    public WaitList() {
        this.content = new ConcurrentLinkedQueue<>();
    }

    /**
     * Конструктор для списка ожидания с заданной коллекцией.
     * @param c коллекция для инициализации списка ожидания
     */
    public WaitList(Collection<E> c) {
        this.content = new ConcurrentLinkedQueue<>(c);
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return this.content.poll();
    }

    @Override
    public boolean contains(E element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }

    @Override
    public String toString() {
        return "WaitList {" +
                "content = " + content +
                '}';
    }
}

