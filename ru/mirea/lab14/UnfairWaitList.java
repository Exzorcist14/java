package ru.mirea.lab14;

import java.util.LinkedList;

class UnfairWaitList<E> extends WaitList<E> {
    private LinkedList<E> removedElements;

    /**
     * Конструктор для создания несправедливого списка ожидания.
     */
    public UnfairWaitList() {
        super();
        this.removedElements = new LinkedList<>();
    }

    /**
     * Добавляет элемент в список ожидания, если он ранее не был удалён
     * @param element элемент для добавления
     */
    @Override
    public void add(E element) {
        if (!removedElements.contains(element)) {
            content.add(element);
        }
    }

    /**
     * Удаляет первое вхождение указанного элемента из списка ожидания.
     * Если элемент не является первым, он перемещается в конец списка.
     * @param element элемент для удаления или перемещения
     */
    public void remove(E element) {
        if (content.peek().equals(element)) {
            return;
        }

        if (content.remove(element)) {
            removedElements.add(element);
        } else {
            content.add(content.poll());
        }
    }

    /**
     * Перемещает первое вхождение указанного элемента в конец списка ожидания.
     * @param element элемент для перемещения
     */
    public void moveToBack(E element) {
        if (content.remove(element)) {
            content.add(element);
        }
    }

    @Override
    public String toString() {
        return "UnfairWaitList {" +
                "content = " + content +
                '}';
    }
}