package lesson9;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* // найти все локальные минимумы
        Scanner in = new Scanner( System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();
        } while (size <=0);
        int[] arr = new int[size];
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = gen.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for ( int i =1; i <arr.length - 1; i++ ) {
            if (arr [i] < arr [i-1] && arr [i] < arr[i+1]){
                System.out.println(arr [i] + " на позиции " + i);
            }
        }
                */
      /* //найти минимальный элемент в массиве
        Scanner in = new Scanner( System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();
        } while (size <=0);
        int[] arr = new int[size];
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = gen.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr [i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println(("min = " + min + " index = " + minIndex));
               */
      /* // найти минимальный элемент в массиве cреди четных индексов
        Scanner in = new Scanner( System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();
        } while (size <=0);
        int[] arr = new int[size];
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = gen.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i+=2) {
            if (arr [i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println(("min = " + min + " index = " + minIndex));

       */
       /* // найти максимальный элемент в массиве cреди нечетных индексов
        Scanner in = new Scanner( System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();
        } while (size <=0);
        int[] arr = new int[size];
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++){
            arr[i] = gen.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int max = arr[1];
        int maxIndex = 1;
        for (int i = 1; i < arr.length; i+=2) {
            if (arr [i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(("max = " + max + " index = " + maxIndex));
                */
       /*//Array51. Даны массивы A и B одинакового размера N. Поменять местами их
        //содержимое и вывести вначале элементы преобразованного массива A, а
        //затем — элементы преобразованного массива B.
        Scanner in = new Scanner( System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();
        } while (size <=0);
        int[] arr = new int[size];
        int[] mas = new int [size];
        //заполнение  случайными числами
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++){
            arr [i] = gen.nextInt(10);
            mas [i] = gen.nextInt(21)-10;
        } // вывод массивов
        System.out.print("Массив arr ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }// вывод массивов
            System.out.println();
            System.out.print("Массив mas ");
            for (int i = 0; i < mas.length; i++) {
                System.out.print(mas[i] + " ");
            }//обмен
            System.out.println();
            for (int i = 0; i < arr.length; i++ ){
                int temp = arr [i];
                arr[i] = mas [i];
                mas[i] = temp;
            }
           // вывод массивов
           System.out.print("Массив arr ");
           for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
           }
            System.out.print();
           // вывод массивов
           System.out.println();
           System.out.print("Массив mas ");
            for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
                */
        /*//Array52. Дан массив A размера N. Сформировать новый массив B того же
        //размера, элементы которого определяются следующим образом:
        //BK = 2·AK, если AK < 5,
         //       AK/2 в противном случае
        Scanner in = new Scanner( System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();
        } while (size <=0);
        int[] a = new int[size];
        int[] b = new int [size];
        //заполнение  случайными числами
        Random gen = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(10);}
            // вывод массива
            System.out.print("Массив a ");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
             System.out.println();
            //сформировать массив b
            for (int i = 0; i < a.length; i++){
                if (a[i] < 5) {
                    b[i] = 2* a[i];
            }
             else { b[i] = a[i]/2;

            }
        }
        //вывод массива b
             System.out.print("Массив b ");
             for (int i = 0; i < b.length; i++) {
             System.out.print(b[i] + " ");
             }
        System.out.println();

         */
       /* //Array53. Даны два массива A и B одинакового размера N. Сформировать новый
        //массив C того же размера, каждый элемент которого равен максимальному
        //из элементов массивов A и B с тем же индексом.
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] a = new int[size];
        int[] b = new int[size];
        int[] c = new int[size];
        // заполнение массива a и б случайно
        Random gen = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(10);
            b[i] = gen.nextInt(10);
        }
        // вывод массива a
        System.out.print("Массив a ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        // вывод массива
        System.out.print("Массив b ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        // формируем массив с
        for (int i = 0; i < c.length; i++) {
            if (a[i] >= b[i]) {
                c[i] = a[i];
            } else {
                c[i] = b[i];
            }
        }
        //вывод массива с
        System.out.print("Массив c ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();

         */
         //Array54. Дан целочисленный массив A размера N. Переписать в новый целочисленный массив B
        // все четные числа из исходного массива (в том же
        //порядке) и вывести размер полученного массива B и его содержимое.
        /*Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] a = new int[size];
        // заполнение массива a  случайными числами
        Random gen = new Random();
        int even_qtr = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(15);
            if (a[i] % 2 == 0)
                even_qtr++;
        }
        System.out.println("Количество четных чисел в массиве " + even_qtr);
        //вывод массива  а
        System.out.print("Массив a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        //создание и формировани b массива
        if (even_qtr ==0) {
            System.out.println( "В массиве а нет четнных чисел");
        }
        else {
            int[] b = new int [even_qtr];
            int j = 0;
            for (int i = 0; i < a.length; i++){
                if (a[i] %2 == 0 ){
                    b[j] = a[i];
                    j++;
                }
            }
            System.out.println();
            System.out.print("Массив в: ");
            for (int i =0; i< b.length; i++){
                System.out.print(b[i] + " ");
            }
        }
        System.out.println();

         */
        /*//Array55. Дан целочисленный массив A размера N (≤ 15). Переписать в новый
        //целочисленный массив B все элементы с нечетными порядковыми номерами (1, 3, . . .) и
        // вывести размер полученного массива B и его содержимое.Условный оператор не использовать.
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] a = new int[size];
        int[] b = new int[size/2];
        // заполнение массива a  случайно
        Random gen = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(20);
            }
        // вывод массива a
        System.out.print("Массив a ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        //формируем массива в
        for (int i=1, j=0; i <a.length; i+=2, j++) {
            b[j] = a[i];
            //изменение счетчиков
        }
        System.out.println();
        // вывод массива b
        System.out.print("Массив b ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
         */

       /* //Array65. Дан массив A размера N и целое число K (1 ≤ K ≤ N). Преобразовать
        //массив, увеличив каждый его элемент на исходное значение элемента AK.
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] a = new int[size];
        // заполнение массива a  случайно
        Random gen = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(20);
        }
        // вывод массива a
        System.out.print("Исходный массив a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Введите номер элемента массива: ");
        int k = in.nextInt();
        for ( int i = 0; i < a.length; i++){
            if (i != k) {
            a [i] += a[k];
            }
            }
        a[k]+=a[k];
        System.out.print("Преобразованный массив a ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
                */
        /*//Array68◦ Дан массив размера N. Поменять местами его минимальный и максимальный элементы.
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.print("Введите размер массива ");
            size = in.nextInt();
        } while (size <= 0);
        int[] a = new int[size];
        // заполнение массива a  случайно
        Random gen = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.nextInt(20);
        }
        // вывод массива a
        System.out.print("Исходный массив a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        //ищем максимальный и минимальный элементы массива
        int min = a[0];
        int minIndex = 0;
        int max =  a[0];
        int maxIndex = 0;
        for (int i = 0; i<a.length; i++){
            if (a[i] < min){
                min = a[i];
                minIndex = i;
            }
            else if (a[i]> max){
                max = a[i];
                maxIndex = i;
            }
        }
        // переставляем местами максимальную и минимальную
         a[minIndex] = max;
        a[maxIndex] = min;
        System.out.println(max);
        System.out.println(min);
        System.out.print("Преобразованный массив a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

         */

    }
}




