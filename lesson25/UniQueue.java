package com.company.lesson25;

public interface UniQueue<T> {
    boolean isEmpty();
    void addElement(T data);
    T removeElement();
    T peekFirst();
}
