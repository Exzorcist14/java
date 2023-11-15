package ru.mirea.lab21;

public class Test {
    public static void main(String[] args) {
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<>();
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(3);

        System.out.println(linkedQueue.element());
        System.out.println(linkedQueue.dequeue());

        linkedQueue.enqueue(4);
        System.out.println(linkedQueue.dequeue());
        System.out.println(linkedQueue.dequeue());
        System.out.println(linkedQueue.dequeue());
    }
}
