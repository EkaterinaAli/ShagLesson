package lesson43_stream;

import java.util.*;

//Задание 2
        //Для набора названий городов (города могут повторяться) нужно:
        //■ Показать все города;
        //■ Показать все города с названием длиннее шесть символов;
        //■ Посчитать сколько раз встречается город, чье название ввёл пользователь;
        //■ Показать все города, которые начинаются на заданную букву;
public class Task2 {
    public static void main(String[] args) {
        final int size = 10;
        Random gen = new Random();
        List<String> town = new ArrayList<>();

        town.add("Минск");
        town.add("Брест");
        town.add("Берлин");
        town.add("Воронеж");
        town.add("Могилев");
        town.add("Париж");
        List <String> dupTowns = new ArrayList<>();
        //System.out.println(town);
        //Collections.shuffle(town);
        //System.out.println(town);
        //■ Показать все города - РАНДОМНО
        for (int i = 0; i <size; i++ ){
            dupTowns.add(town.get(gen.nextInt(town.size())));
        }
        System.out.println(dupTowns);
       //вывод на экран
       // dupTowns.stream().forEach(x -> System.out.print(x + " "));
     //■ Показать все города с названием длиннее шесть символов;
        System.out.println();
        dupTowns.stream().filter(x ->x.length()>6).forEach(x-> System.out.print(x + " "));
        //■ Посчитать сколько раз встречается город, чье название ввёл пользователь;
        System.out.println();
        System.out.println(dupTowns.stream().filter(x ->x.equals("Минск")).count());
        //■ Показать все города, которые начинаются на заданную букву;
        dupTowns.stream().filter(x ->x.charAt(0) == 'М').forEach(x-> System.out.print(x + " "));
    }
}
