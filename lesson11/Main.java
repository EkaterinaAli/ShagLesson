package lesson11;

import java.util.Random;
import java.util.Scanner;

// Вариант 1
public class Main {
    //заполнение случайными числами
    static void fillRandom(int[] mas, int left, int right){
        Random gen = new Random();
        for (int i = 0; i < mas.length; i++ ){
            mas [i] = gen.nextInt(right - left + 1) + left;
        }
    }

    static void print (int[] mas ){
        for (int i = 0; i < mas.length; i++ ){
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    static int sumOfArray(int [] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++ ){
            sum += mas [i];
        }
        return sum;
    }

    static int proizveden (int [] mas) {
        int pr =1;
        for (int i = 0; i < mas.length; i++){
            pr *=mas[i];
        }
        return pr;
    }

    static double arifmAvg ( int [] arr){
        int sum = 0;
        int kol = 0;
        for (int i = 0; i < arr.length; i++){
            sum +=arr[i];
        }
        return (double) sum /arr.length;
    }

    static int countLessK( int [] mas, int k){
        int qty =0;
        for (int i = 0; i < mas.length; i++){
            if (mas[i] < k) qty++;
        }
        return qty;
    }

    static int numElem (int [] mas, int k){
        int res = -1;
        for (int i = 0; i < mas.length; i++){
            if (mas[i] > k){
                res = i;
                break;
            }
        }
        return res;
    }

    static void printLessRight (int[] mas){
        for (int i = 0; i < mas.length-1; i++){
            if (mas[i] < mas[i+1]){
                System.out.println(mas[i] + " ");
            }
        }
        System.out.println();
    }
    static int countLessRight (int[] mas) {
        int qty = 0;
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] < mas[i + 1]) {
                qty++;
            }
        }
        return qty;
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillRandom(arr, -10,10);
        print(arr);
        Scanner in = new Scanner(System.in);

        //Series1◦ Даны десять из десяти целых чисел. Найти их сумму.
        //System.out.println("Сумма элементов массива "  + sumOfArray(arr));
        //Series2. Даны десять вещественных чисел. Найти их произведение.
        //System.out.println( " произведение чисел " + proizveden(arr));
        //Series3. Даны десять вещественных чисел. Найти их среднее арифметическое
        //System.out.println( "среднее арифметическое равно " + arifmAvg(arr));
        //Series14. Дано целое число K и массив из десяти целых чисел; Вывести количество чисел в наборе, меньших K.
        //System.out.print( " Введите К ");
        //int k = in.nextInt();
        //System.out.println("количество элементов меньше К " + countLessK(arr, k));
        //Series15◦Дано целое число K и массив из десяти целых чисел;
        // Вывести номер первого числа в наборе, большего K. Если таких чисел нет, то вывести -1.
       // System.out.print( " Введите К ");
       // int k = in.nextInt();
       // System.out.println("Номер первого элемента меньше К №: " + numElem(arr, k));
        //Series20. Дано целое число N (> 1) и массив из N целых чисел. Вывести те
        //элементы массива, которые меньше своего правого соседа, и количество K
        //таких элементов.
        System.out.print( " Введите N ");
         int k = in.nextInt();
        System.out.println("" + printLessRight(arr)+ "Количество " + countLessRight(arr));
    }
}
