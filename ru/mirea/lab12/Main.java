package ru.mirea.lab12;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int temp = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack, temp);
    }

    private static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            int temp = stack.pop();
            insertAtBottom(stack, item);
            stack.push(temp);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cards1 = scanner.nextInt();
        int cards2 = scanner.nextInt();

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while (cards1 > 0 && cards2 > 0) {
            stack1.push(cards1%10);
            stack2.push(cards2%10);

            cards1 /= 10;
            cards2 /= 10;
        }

        int moves = 0;
        while (moves < 106) {
            moves++;

            int card1 = stack1.pop();
            card1 = card1 == 0 ? 10 : card1;

            int card2 = stack2.pop();
            card2 = card2 == 0 ? 10 : card2;

            if (card1 > card2 || (card1 == 0 && card2 == 9)) {
                reverseStack(stack1);
                stack1.push(card2 % 10);
                stack1.push(card1 % 10);
                reverseStack(stack1);
            }

            else {
                reverseStack(stack2);
                stack2.push(card1 % 10);
                stack2.push(card2 % 10);
                reverseStack(stack2);
            }

            if (stack1.isEmpty()) {
                System.out.println("second " + moves);
                return;
            }

            else if (stack2.isEmpty()) {
                System.out.println("first " + moves);
                return;
            }
        }

        System.out.println("botva");
    }
}
