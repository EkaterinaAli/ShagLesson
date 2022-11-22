package lesson33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CarTest {
    public static void filterCars(List<Car> cars, Predicate<Car> predicate, Consumer<Car> consumer){
        for (Car car : cars ){
            if (predicate.test(car)){
                consumer.accept(car);
            }
        }
    }
    public static void main(String[] args) {
        Car car1 = new Car(Car.Body.CUPE,200);
        Car car2 = new Car(Car.Body.SEDAN, 150);
        Car car3 = new Car(Car.Body.HATCHBACK, 284);
        Car car4 = new Car(Car.Body.CUPE,250);
        Car car5 = new Car(Car.Body.CUPE,200);
        Car car6 = new Car(Car.Body.SEDAN, 150);
        Car car7 = new Car(Car.Body.HATCHBACK, 284);
        Car car8 = new Car(Car.Body.HATCHBACK, 100);
        Car car9 = new Car(Car.Body.HATCHBACK, 284);
        List<Car> carList = Arrays.asList(car1,car2,car3,car4,car5,car6,car7,car8,car9 );
        //List<Car> carList = new ArrayList<>();
        //carList.add(car1);
        //carList.add(car2);
        //carList.add(car3);
        filterCars(carList, (car) -> {return car.getPower()>=200;}, (car)-> {
            System.out.println(car);});
        //1-я лямбда -  сортировать все машины с кузовом седан
        System.out.println();
         filterCars(carList, (car) -> {return car.getBody() == Car.Body.SEDAN;}, (car)-> {
          System.out.println(car);});
        //2-я лямбда - сортировать все машины с хэтчбек и мощностью меньше 200
        System.out.println();
        filterCars(carList, (car) -> {return car.getBody() == Car.Body.HATCHBACK && car.getPower()<200;}, (car)-> {
            System.out.println(car);});

    }
}
