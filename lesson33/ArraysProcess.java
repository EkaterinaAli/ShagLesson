package lesson33;

import java.util.function.Predicate;

public class ArraysProcess {
    public static int arrayProcess(int[] arr, Predicate<Integer> predicate){
        int sum = 0;
        for  (Integer elem : arr){
            if (predicate.test(elem)){
                sum += elem;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        //Метод находим сумму элементов массива которые
        //соответсвуют условию лямбда-выраения
        //-проверка четности
        //-проверка нечетности
        //-число находится в диапазоне от А до В
        // - проверка кратности параметру А
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(arrayProcess (arr, x -> x%2 == 0));
        int a = 1;
        int b = 4;
        System.out.println(arrayProcess (arr, x -> x>=a && x<=b));
        System.out.println();
    }
}
