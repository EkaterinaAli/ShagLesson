package com.company;

import com.company.details.Engine;

import com.company.lesson19.Student;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Engine e1 = new Engine(150, "BMW");
        Driver d1 = new Driver("Ivan Ivanov", 40, 15);
        Car c1 = new Car("Lorry", "Volva", e1, d1 );
        System.out.println(c1);
        System.out.println();
        Car [] mas = new Car[2];

        Lorry l1 = new Lorry ("LorryBig", "MAZ", e1, d1, 30);
        SportCar s1 = new SportCar("Sport","Ferrari", e1, d1, 200);

        mas [0] = l1;
        mas [1] = s1;

        for (Car s : mas){
            System.out.println(s);

        }

    }
}
