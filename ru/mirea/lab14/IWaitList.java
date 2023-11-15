package ru.mirea.lab14;

import java.util.Collection;

/**
 * Интерфейс IWaitList для списков ожидания.
 * @param <E> тип элементов списка
 */
interface IWaitList<E> {
    /**
     * Добавляет элемент в список ожидания.
     * @param element элемент для добавления
     */
    void add(E element);

    /**
     * Удаляет элемент из списка ожидания, если он присутствует.
     * @param element элемент для удаления
     * @return true, если элемент был удален, иначе false
     */
    public E remove();

    /**
     * Проверяет, содержит ли список ожидания указанный элемент.
     * @param element элемент для проверки наличия
     * @return true, если список содержит элемент, иначе false
     */
    boolean contains(E element);

    /**
     * Проверяет, содержит ли список ожидания все элементы из указанной коллекции.
     * @param c коллекция элементов для проверки
     * @return true, если список содержит все элементы, иначе false
     */
    boolean containsAll(Collection<E> c);

    /**
     * Проверяет, пуст ли список ожидания.
     * @return true, если список ожидания пуст, иначе false
     */
    boolean isEmpty();

}
