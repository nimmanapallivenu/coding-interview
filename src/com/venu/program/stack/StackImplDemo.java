package com.venu.program.stack;

class Stack {
    static final int MAX = 100;
    int top;
    int a[] = new int[MAX];

    boolean isEmpty() {
        return top < 0;
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println(" Stack over flow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " Pushed into stack");
            return true;
        }
    }

    int peep() {
        if (top < 0) {
            System.out.println(" Stack is Empty");
            return 0;
        } else {
            return a[top];
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return a[top--];
        }
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.println(" " + a[i]);
        }
    }
}

public class StackImplDemo {

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.print();

        System.out.println(" Peep " + stack.peep());
        System.out.println(" Pop " + stack.pop());

        stack.print();


    }

}
