package ru.mirea.lab20.ex1;

import java.util.Scanner;
import java.util.Stack;

public class Calc {
    private Stack<Float> st;
    private String str;
    private String[] exp;

    public Calc() {
        Scanner sc = new Scanner(System.in);
        st = new Stack<>();
        System.out.println("Введите выражение в обратной польской нотации: ");
        str = sc.nextLine();
        exp = str.split(" ");
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void countExp() {
        for (int i = 0; i < exp.length; i++) {
            if (isDigit(exp[i])) {
                st.push(Float.parseFloat(exp[i]));
            }

            else if (exp[i].equals("+") || exp[i].equals("-") || exp[i].equals("*") || exp[i].equals("/")) {
                if (st.size() < 2) {
                    System.err.println("Не хватает операндов для операции " + exp[i]);
                    break;
                }

                float a = st.pop();
                float b = st.pop();

                if (exp[i].equals("+")) {
                    st.push(a + b);
                }

                else if (exp[i].equals("-")) {
                    st.push(b - a);
                }

                else if (exp[i].equals("*")) {
                    st.push(a * b);
                }

                else if (exp[i].equals("/")) {
                    if (a == 0) {
                        System.err.println("Деление на ноль!");
                        break;
                    }
                    st.push(b / a);
                }
            } else {
                System.err.println("Неправильный ввод: " + exp[i]);
                break;
            }
        }

        if (!st.isEmpty()) {
            System.out.println(st.peek());
        }
    }

}