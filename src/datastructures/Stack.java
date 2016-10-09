package datastructures;

import java.util.StringJoiner;

/**
 * @author Subhomoy Haldar
 * @version 09-10-2016
 */
public class Stack {
    private int top;
    private final int size;
    private int[] a;

    public Stack(int size) {
        this.size = size;
        a = new int[size];
        top = -1;
    }

    public void push(int x) throws CapacityException {
        if (top == size - 1) {
            throw new CapacityException("Stack Overflow");
        }
        a[++top] = x;
    }

    public int pop() throws CapacityException {
        if (top == -1) {
            throw new CapacityException("Stack Underflow");
        }
        return a[top--];
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        for (int i = top; i >= 0; i--) {
            joiner.add(String.valueOf(a[top]));
        }
        return joiner.toString();
    }
}
