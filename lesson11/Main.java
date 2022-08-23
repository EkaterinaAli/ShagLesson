package lesson11;

import java.util.Random;

// Вариант 1
public class Main {
    public static void main (String[] args){

        /*int[] arr = new int[10];
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(20);
            System.out.print(arr[i] + " ");
        }
        int proiz = 1;
        for (int i = 0; i < arr.length; i++){
            proiz *=arr[i];
        }
        System.out.println();
        System.out.println("Произведение элементов массива " + proiz);
                 */
        /*int[] arr = new int[8];
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(21)-10;
            System.out.print(arr[i] + " ");}
        int summ = 0;
        for (int i = 0; i < arr.length; i++ ) {
            if (arr[i] > 0) {
                summ += arr[i];
            }
        }
            System.out.println();
            System.out.println("Сумма положительных чисел равна" + summ);
         */
        /*int[] arr = new int[16];
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(20);
            System.out.print(arr[i] + " ");
        }
        int kol =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                kol++;
            } else if (arr [i]%5 == 0 ){
                kol ++;
            }

        }
        System.out.println();
        System.out.print("Количество элементов которые деляться на 3 и 5 равно " + kol);

       /* int[] arr = new int[9];
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = gen.nextInt(21) - 10;
            System.out.print(arr[i] + " ");
        }
        int kol = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                kol++;
        }
        System.out.print("Количество четных чисел равно " + kol);

        */

    }


}

