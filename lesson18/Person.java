package lesson18;

public class Person {
    //https://www.examclouds.com/ru/java/java-core-russian/lesson7-tasks
    //Матрицы
    //2. Класс Person
    //Создать класс Person, который содержит:
    //переменные fullName, age;
    //методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
    //Добавьте два конструктора  - Person() и Person(fullName, age).
    //Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
    private String fullName;
    private int age;

    public void setFullName(String fullName){ this.fullName = fullName;}
    public String getFullName(){return fullName;}
    public void setAge(int age) { this.age = age;}
    public int getAge() { return age;}

    public Person(){   }
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
    public void move(){
        System.out.println(fullName + " идет");
    }
}
