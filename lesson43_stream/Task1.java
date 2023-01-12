package lesson43_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//Задание 1
//Для набора случайно сгенерированных целых чисел
//нужно:
//■ Количество четных;
//■ Количество нечетных;
//■ Количество равных 0;
//■ Количество равных значению, введенному пользователем.
public class Task1 {
    public static void main(String[] args) {
        final int size = 10;
        List <Integer> mas = new ArrayList<>(size);
        Random gen = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i =0; i < size; i++)
            mas.add(gen.nextInt(11)-10);
        System.out.println(mas);

        //Количество четных;
        System.out.println(" Четных " + mas.stream().filter(x -> x%2 == 0 && x !=0).count());
        // Количество нечетных;
        System.out.println(" Нечетных " + mas.stream().filter(x -> x%2 != 0).count());
        //Количество равных 0;
        System.out.println(" Равных нулю " + mas.stream().filter(x -> x == 0).count());
        //Количество равных значению, введенному пользователем.
        System.out.println(" введите число ");
        int n = sc.nextInt();
        System.out.println(" Равных n " + mas.stream().filter(x -> x == n).count());



    }



}
