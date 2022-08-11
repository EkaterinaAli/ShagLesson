package lesson8;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
       /* //повторять ввод пока пользоваатель не введет число от 0 до 10
                int i;
                Scanner in = new Scanner(System.in);
                do {
                    System.out.println("Введіте целое чісло ");
                    i = in.nextInt();
                } while ( i < 0 || i >10);
                // !(i >=0 && i <=10) !(i

        /*final int size = 10;
        int [] mas = new int[size];
        int [] mas1 = {0,1,2,3,4,5,6,7,8,9};
        // заполнить массив случайными числами
        for (int i = 0; i < mas.length ; i++){
            mas[i] = (int)(Math.random()*11)-5;
        }
        //вывести массив в строку
        for (int i = 0; i < mas.length ; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();

         */
        /*//Array1. Дано целое число N (> 0). Сформировать и вывести целочисленный
        //массив размера N, содержащий N первых положительных нечетных чисел:
        //1, 3, 5, . . . .
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();
        }
        while (size < 1);
        int [] arr = new int [size];
        int j =1;
        for(int i = 0; i < arr.length; i++){
            arr[i] = j; // arr[i] = 2*i+1
            j +=2;
        }
        // 0-1 1-3 2-5 3-7= 2*3+1 4-9 = 2*4+1 5-11 =2*5+1
        //
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
                 */
        /*//Array2. Дано целое число N (> 0). Сформировать и вывести целочисленный
        //массив размера N, содержащий степени двойки от первой до N-й: 2, 4,
        //8, 16, . . . .
        Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size = in.nextInt();}
            while (size < 1);
            int [] arr = new int [size];
            int j = 2;
            for(int i = 0; i < arr.length; i++) {
                arr[i] = j;
                j *= 2;
            }

            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
             */
       /*// Array3. Дано целое число N (> 1), а также первый член A и разность D арифметической
        // прогрессии. Сформировать и вывести массив размера N, содержащий N первых членов данной прогрессии:
       // A + 0*D, A + 1*D, A + 2·D, A + 3·D, . . . .

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        int size = in.nextInt();
        int[] arifm = new int [size];
        System.out.print("Введите первый член А ");
        int a = in.nextInt();
        System.out.print("Введите разность D ");
        int d = in.nextInt();
        arifm [0] = a;
        for (int i = 1; i< arifm.length; i++){
            arifm[i] = a + i*d;
            // for (int i = 0; i< arifm.length; i++){
            //            arifm[i] = a + i*d;
        }
        for (int i = 0; i < arifm.length; i++){
            System.out.println(arifm[i] + " ");
        }
        System.out.println();
                */
       /* //Array7◦ Дан массив размера N. заполнить случайными целыми числами. Вывести его элементы в прямом
        // и обратном порядке.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            int a = (int) (Math.random() * 10);
            arr[i] = a;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");}
            System.out.println();
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }

        */
       /* //Array8. Дан целочисленный массив размера N. Вывести все содержащиеся в
        //данном массиве нечетные числа в порядке возрастания их индексов, а
        //также их количество K
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            int a = (int) (Math.random() * 10);
            arr[i] = a;
            System.out.print(arr[i] + " ");
            }
        System.out.println();
        int kol = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            kol ++;
            }
        }
        System.out.println();
        System.out.println("КОЛИЧЕСТВО нечетных чисел " + kol);
                */
        //Array9. Дан целочисленный массив размера N. Вывести все содержащиеся в
        //данном массиве четные числа в порядке убывания их индексов, а также
        //их количество K.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            int a = (int) (Math.random() * 10);
            arr[i] = a;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int kol = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr.length - 1 - i] % 2 == 0) {
                System.out.print(arr[arr.length - 1 - i] + " ");
                kol ++;
            }
        }
        System.out.println();
        System.out.println("КОЛИЧЕСТВО четных чисел " + kol);

    }
}
