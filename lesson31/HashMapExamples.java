package lesson31;

import javax.swing.*;
import java.util.*;

public class HashMapExamples {
    public static void main(String[] args) {
        /*Map<Integer, String> studList = new HashMap<>();
        studList.put(1, "Алисионок Екатерина");
        studList.put(3, "Козловский Константин");
        studList.put(5, "Красько Денис");
        studList.put(2, "Калацкий Павел");
        studList.put(4, "Кондратенко Владимир");
        for (Integer key :studList.keySet()){
            System.out.println(key + " " + studList.get(key));
        }
                 */
        //картотека котов " кличка - вес
        /*Map <String, Integer> catCabinet = new HashMap<>();
        Random gen = new Random();
        String[] catNames = {"Васька", "Барсик", "Мурзик", "Борис", "Кеша", "Бадя", "Мурка" };
        for (int i = 0; i < catNames.length; i++){
            Integer catRandomIndex = gen.nextInt(catNames.length);
            String catName = catNames[catRandomIndex];
            Integer weight = gen.nextInt(10)+1;
            System.out.println(catName + " "+ weight);
            catCabinet.put(catName,weight);

        }
        System.out.println("\nКартотека\n");
        for (String key :catCabinet.keySet()){
            System.out.println(key + " " + catCabinet.get(key));
        }
        System.out.print("Коты с весом 5 кг: ");
        if (catCabinet.containsValue(5)){
            for (Map.Entry<String, Integer > pair : catCabinet.entrySet()){
                if (pair.getValue().equals(5)){
                    System.out.println(pair.getKey()+ " "+pair.getValue());
                }
            }
        }
        else {
            System.out.println("Нет таких катов");
        }
        */
       /* String str = "Мама - первое слово," +
                "Главное слово в каждой судьбе. " +
                "Мама жизнь подарила," +
                "Мир подарила мне и тебе." +
                "\n" +
                "Так бывает - ночью бессонною " +
                "Мама потихоньку всплакнет," +
                "Как там дочка, как там сынок ее - " +
                "Лишь под утро мама уснет." +
                "\n" +
                "Мама - первое слово," +
                "Главное слово в каждой судьбе. " +
                "Мама жизнь подарила," +
                "Мир подарила мне и тебе."
                ;
        String[] words =  str.split("\\\\s|,|!|;|-|[0-9]| |\\\\");
        System.out.println(Arrays.toString(words));
        Map <String , Integer> dict = new HashMap<>();
                for (String word : words){
                    if (dict.containsKey(word)){
                        dict.put(word,dict.get(word)+1);
                    }
                    else dict.put(word,1);
                }
        System.out.println("Cловарь");
                for (String key : dict.keySet()){
                    System.out.println(key + " " + dict.get(key));
                }

        */
        Map <Person, List <? extends Pet> >  hm1 = new HashMap<>();
        hm1.put(new Person("Ivan"), Arrays.asList(new Cat ("Vasya"),new Dog("Bobik")) );
    }
}
