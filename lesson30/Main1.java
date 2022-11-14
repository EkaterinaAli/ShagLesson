package lesson30;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        //Пользователь вводит с клавиатуры набор чисел. Полученные числа необходимо сохранить в список. После
        //чего нужно показать меню, в котором предложить пользователю набор пунктов:
        //1. Добавить элемент в список.
        //2. Удалить элемент из списка.
        //3. Показать содержимое списка.
        //4. Проверить есть ли значение в списке.
        //5. Заменить значение в списке.
        //В зависимости от выбора пользователя выполняется
        //действие, после чего меню отображается снова.
        Scanner in = new Scanner(System.in);
        int choice;
        List<String> st = new ArrayList<>();
        while (true) {
            printMenu();
            choice = in.nextInt();
            switch (choice) {
                case 1: addElem(st);
                    break;
                case 2:
                    int i = 0;
                    String str = null;
                    deletElem(st, i);
                    deletElem(st, str);
                    break;
                case 3:
                    System.out.println();
                    printList(st);
                    System.out.println();
                    break;
                case 4:
                    String str2 = null;
                    checkList(st, str2);
                    break;
                case 5:
                    String str3 = null;
                    int index = 0;
                    changeList(st, str3, index );
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Нет такого пункта в меню");
            }
        }
    }

    static void printMenu() {
        System.out.println("1. Добавить элемент в список.");
        System.out.println("2. Удалить элемент из списка.");
        System.out.println("3. Показать содержимое списка.");
        System.out.println("4. Проверить есть ли значение в списке.");
        System.out.println("5. Заменить значение в списке.");
        System.out.println("9. Выход");
        System.out.print("Введите номер нужного пункта: ");
    }
    static void addElem(List<String> lst) {
        if (lst != null) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите строку: ");
            String str = in.nextLine();
            lst.add(str);
        }
        else {
            System.out.println( "Список пустой ");
        }
    }
    static void deletElem(List<String> fSt, int index) {
        System.out.println("Под каким индексом удалить элемент из списка ");
        Scanner in = new Scanner(System.in);
        index = in.nextInt();
        if (index < fSt.size()){
            fSt.remove(index); }
        else {
            System.out.println("Нет такого индекса");
        }
    }
    static void deletElem(List<String> fSt, String str ) {
        System.out.println("Какой удалить элемент из списка ");
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        fSt.contains(str);
        if (fSt.contains(str) == true){
            fSt.remove(str);}
        else {
            System.out.println("Нет такого элемента ");
        }
    }
    static void printList (List <String> fSt) {
        System.out.println("Cодержимое списка: ");
        System.out.println(fSt.toString());
    }
    static void checkList (List<String> fSt, String str ){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку которую надо сравнить ");
        str = in.nextLine();
        fSt.contains(str);
        if (fSt.contains(str) == true){
            System.out.println("Есть такой элемент ");}
        else {
            System.out.println("Нет такого элемента ");
        }
    }
    static void changeList (List<String> fSt, String str, int index){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите индекс элемента, который нужно заменить  ");
        index = in.nextInt();
        Scanner on = new Scanner(System.in);
        System.out.println("Введите новое значение ");
        str = on.nextLine();
        if (index < fSt.size()){
            fSt.set(index,str); }
        else {
            System.out.println("Нет такого индекса");
        }
    }
}
