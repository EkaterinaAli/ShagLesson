package com.company.lesson25;

public interface Stackable <T> {
    void push(T date);
    T peek();
    T pop();
    String toString();
    boolean isEmpty();
}
