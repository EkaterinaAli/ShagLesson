package lesson29;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        final List list1 = new ArrayList<>();
        final List list2 = new ArrayList<>();

        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list2.addAll(list1);
        list1.clear();
        System.out.println("Лист1: " + list1);
        System.out.println("Лист2: " + list2);

        //Задача 2. вывести второй список с помощью итератора
        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}


