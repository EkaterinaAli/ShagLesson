package lesson17;

public class Main {
    public static void main (String [] agrs){
    //Класс Phone.
    //Создайте класс Phone, который содержит переменные number, model и weight.
    //Создайте три экземпляра этого класса.
    //Создайте метод toString, который выводит на консоль значения всех полей класса.
    //Добавить в класс Phone методы:
    // а)receiveCall, имеет один параметр – имя звонящего.
    // в) Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
    //Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
    //Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
    //Добавить конструктор без параметров.
    //Вызвать из конструктора с тремя параметрами конструктор с двумя.
    //Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
    //Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
    //Изменить класс Phone в соответствии с концепцией JavaBean. Смотрите решение задачи в видео 1, видео 2, видео 3, видео 4, видео 5.
        Phone p1 = new Phone(1234, "iphone", 200);
        System.out.println(p1);
        p1.receiveCall("Vasya");
        p1.getNumber();
        p1.receiveCall("Vasya", 1234);


        Phone p2 = new Phone(1111,"samsung", 250);
        System.out.println(p2);
        p2.receiveCall("Petya");
        p2.getNumber();
        p2.receiveCall("Petya", 1111);

        Phone p3 = new Phone(5555, "xiaomi", 300);
        System.out.println(p3);
        p3.receiveCall("Kolya");
        p3.getNumber();
        p3.receiveCall("Kolya", 5555);


    }
}

