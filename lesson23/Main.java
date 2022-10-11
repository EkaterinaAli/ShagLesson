package com.company.lesson23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException { //исключение связаное с вводом
       /* //Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
        String str = "I like Java!!&";
        //Распечатать последний символ строки. Используем метод String.charAt().
        System.out.println(str.charAt(str.length() - 1));
        //Проверить, заканчивается ли ваша строка подстрокой “!!!”.
        // Используем метод String.endsWith().
        System.out.println(str.endsWith("!!!"));
        //Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        System.out.println(str.startsWith("I like"));
        //Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println(str.contains("Java"));
        //Найти позицию подстроки “Java” в строке “I like Java!!!”.
        System.out.println(str.indexOf("Java"));
        //Заменить все символы “а” на “о”.
        System.out.println(str.replace('a','o'));
        //Преобразуйте строку к верхнему регистру.
        System.out.println(str.toLowerCase(Locale.ENGLISH));
        //Преобразуйте строку к нижнему регистру.
        System.out.println(str.toUpperCase(Locale.ENGLISH));
        //Вырезать строку Java c помощью метода String.substring().
        System.out.println(str.substring(str.indexOf("I like"),str.indexOf("I like")+"I like".length()));
                */
        //Дано два числа, например 3 и 56, необходимо составить следующие строки:
        //3 + 56 = 59
        //3 – 56 = -53
        //3 * 56 = 168.
        //Используем метод StringBuilder.append().

        Integer x, y;
        BufferedReader buf = new BufferedReader (new InputStreamReader(System.in));
        String str = buf.readLine();
        x = Integer.parseInt(str);
        str = buf.readLine();
        y = Integer.parseInt(str);
        Integer res = x+y;
        StringBuilder sb = new StringBuilder(x.toString());
        sb.append(" + ");
        sb.append(y.toString());
        sb.append(" = ");
        sb.append(res.toString());
        System.out.println(sb);

        Integer res2 = x-y;
        StringBuilder sb2 = new StringBuilder(x.toString());
        sb2.append(" - ");
        sb2.append(y.toString());
        sb2.append(" = ");
        sb2.append(res2.toString());
        System.out.println(sb2);

        Integer res3 = x*y;
        StringBuilder sb3 = new StringBuilder(x.toString());
        sb3.append(" * ");
        sb3.append(y.toString());
        sb3.append(" = ");
        sb3.append(res3.toString());
        System.out.println(sb3);
        int pos = sb3.indexOf("=");

        //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
        //sb3.insert(sb3.indexOf("=")-1, " равно ");
        //sb3.deleteCharAt(sb3.indexOf(" = ") - sb.indexOf("равно"));
        //sb3.insert(pos - sb3.indexOf("равно"),"равно");
        //sb3.deleteCharAt(pos);

       // System.out.println(sb3);
        //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        //sb3.replace(pos,pos+1,"равно");
        //System.out.println(sb3);

        //Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented programming» (не учитываем регистр символов) на «OOP».
        // Например, строка
        //"Object-oriented programming is a programming language model organized around objects rather than
        // "actions" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla."
        //должна быть преобразована в
        //"Object-oriented programming is a programming language model organized around objects rather
        // than "actions" and data rather than logic. OOP blabla. Object-oriented programming bla."
    }
}

