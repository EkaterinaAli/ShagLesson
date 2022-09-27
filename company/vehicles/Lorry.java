package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private int wight;

    Lorry(){}

    public Lorry(String carClass, String brand, Engine engine, Driver driver, int wight) {
        super(carClass, brand, engine, driver);
        this.wight = wight;

    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carClass='" + carClass + '\'' +
                ", brand='" + brand + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", wight=" + wight +
                '}';
    }
}
