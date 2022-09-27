package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String carClass, String brand, Engine engine, Driver driver, int maxSpeed) {
        super(carClass, brand, engine, driver);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "carClass='" + carClass + '\'' +
                ", brand='" + brand + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
