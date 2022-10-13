package com.company.lesson24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Создать коллекция, содержащую объекты класса HeavyBox.
Распечатать его содержимое используя for each.
Изменить вес первого ящика на 1.
listOfBoxes.set(0,listOfBoxes.get(0) +1 );
Удалить последний ящик.
Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
Удалить все ящики.
 */
public class BoxStorage {
    private List <HeavyBox> listofBoxes;

    public BoxStorage(List<HeavyBox> list){
        listofBoxes = new ArrayList<>();
    }
    public BoxStorage (ArrayList<HeavyBox> listofBoxes){
        listofBoxes = new ArrayList<>();
        //this.listofBoxes = listofBoxes; !!! так нельзя надо копировать содержимое параметров в содержимое поле
        /*for (int i = 0; i< listofBoxes.size(); i++){
            this.listofBoxes.add(listofBoxes.get(i));
        }  */
       //this();
       this.listofBoxes.addAll(listofBoxes);
    }
    @Override
    public String toString() {
        return "BoxTest{" +
                "listofBoxes=" + listofBoxes +
                '}';
    }
    public  boolean changeWeightOfBox (int index, int change){
        boolean result = true;
        if (index <0 || index >listofBoxes.size()-1) result = false;
        if (! listofBoxes.get(index).changeWeight(change)){
            result = false;
        }
       return  result;
    }
    public HeavyBox[] getArray () {return (HeavyBox[]) listofBoxes.toArray();}
}
