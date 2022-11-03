package lesson29;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    //Удалить из списка все значения а, которые присутствуют в списке и сохраняя их порядок
    //есди значение присуисивует в b все его вхождения должны быть удалены из другого
    static List<Integer> diff (List <Integer> a, List<Integer> b){
        List <Integer> c = new ArrayList<>();
        a.removeAll(b);
        c.addAll(a);
        return c;
    }
    public static void main(String[] args) {
        List <Integer> a= new ArrayList<>();
        List <Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(2);
        a.add(3);
        b.add(2);
        System.out.println(diff(a,b));
    }
}
