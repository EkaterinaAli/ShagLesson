package lesson18;

public class Main {
    public static void main(String[] args) {
        //https://www.examclouds.com/ru/java/java-core-russian/lesson7-tasks
        //Матрицы
        //2. Класс Person
        //Создать класс Person, который содержит:
        //переменные fullName, age;
        //методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
        //Добавьте два конструктора  - Person() и Person(fullName, age).
        //Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
        /*Person p = new Person();
        System.out.println(p);
        Person p1 = new Person("Вася Пупкин ", 38);
        System.out.println(p1);
        p1.move();
         */
        Matrix m1 = new Matrix(2,2);

        m1.fillMatrix(1);
        m1.print();
        System.out.println();
        Matrix m2 = new Matrix(2,2);
        m2.fillMatrix(2);
        m2.print();
        System.out.println();
        Matrix c = m1.addMatrix(m2);
        if (c!= null)
        c.print();
        else System.out.println("ошибка");

    }
}