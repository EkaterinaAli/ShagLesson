package com.company.lesson24;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       /* //без дженерика
        List listAnimal = new ArrayList();
        listAnimal.add("Cat");
        listAnimal.add("Dog");
        listAnimal.add("Horse");
        String firstAnimal = (String) listAnimal.get(0);
        System.out.println(firstAnimal);
        // с дженериком
        List <String > listAnimal1 = new ArrayList<>();
        listAnimal1.add("Cat1");
        listAnimal1.add("Dog1");
        listAnimal1.add("Horse1");
        String firstAnimal1 = listAnimal1.get(0);
        System.out.println(firstAnimal1);
        */
        Mage mage = new Mage();
        mage.cast();
        mage.hit();
        mage.move();
    }
}
//Интрфейс
//ходить
interface canMove {
    void move();
}
//летать
//бить
interface canHit {
    void hit();
}
//стрелять
//колодовать
interface canCast {
    void cast();
}

//Маг - ходить, бить, колдовать

class Mage implements canMove, canHit, canCast  {//риализовывает интерфейсы

    @Override
    public void cast(){
        System.out.println("Mage casting");
    }

    @Override
    public void hit() {
        System.out.println("Mage hitting");

    }
    @Override
    public void move() {
        System.out.println("Mage moving");

    }
}