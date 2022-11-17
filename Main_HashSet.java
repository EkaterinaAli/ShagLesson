package lesson32;

import java.util.HashSet;
import java.util.Set;

public class Main_HashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        //добавление элементов
        set.add("США");
        set.add("Япония");
        set.add("Франция");
        set.add("Германия");
        set.add("Россия");
        set.add("Беларусь");
        for (String s : set){
            System.out.println(s);
        }
        //удаление
        set.remove("Россия");
        System.out.println("После удаления \"Россия\" ");

        for (String s : set){
            System.out.println(s);
        }
        //contains есть или нет объект
        if (set.contains("Россия") == true){
            System.out.println("Есть");}
        else {
            System.out.println("нет");
        }

        //размер
        //System.out.println("Размер множества " + set.size());

        //set.clear();
        //System.out.println(set.isEmpty());


    }
}
