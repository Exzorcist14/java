package ru.mirea.lab14;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        WaitList<Integer> waitList = new WaitList<>();
        waitList.add(5);
        waitList.add(10);
        waitList.add(15);
        System.out.println(waitList);
        System.out.println(waitList.contains(5));

        ArrayList<Integer> al = new ArrayList();
        al.add(5);
        al.add(15);
        System.out.println(waitList.containsAll(al));

        BoundedWaitList<String> boundedWaitList = new BoundedWaitList<>(3);
        boundedWaitList.add("One");
        boundedWaitList.add("Two");
        boundedWaitList.add("Three");
        System.out.println(boundedWaitList);

        UnfairWaitList<Character> unfairWaitList = new UnfairWaitList<>();
        unfairWaitList.add('a');
        unfairWaitList.add('b');
        unfairWaitList.add('c');
        System.out.println(unfairWaitList);
        unfairWaitList.remove('b');
        System.out.println(unfairWaitList);
        unfairWaitList.add('b');
        System.out.println(unfairWaitList);
        unfairWaitList.moveToBack('a');
        System.out.println(unfairWaitList);
    }
}