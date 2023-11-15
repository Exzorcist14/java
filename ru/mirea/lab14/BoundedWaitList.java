package ru.mirea.lab14;

class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    /**
     * Конструктор для списка ожидания с заданной ограниченной ёмкость.
     * @param capacity ёмкость списка ожидания
     */
    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Возвращает текущую ёмкость списка ожидания
     * @return текущая ёмкость
     */
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (content.size() < capacity) {
            super.add(element);
        }
    }

    @Override
    public String toString() {
        return "BoundedWaitList {" +
                "capacity = " + capacity +
                ", content = " + content +
                '}';
    }
}