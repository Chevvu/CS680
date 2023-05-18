package edu.umb.cs680.hw13;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class YearComparator {
    @Test
    public void YearTest(){
        Car car1 = new Car("Toyota", "RAV4", 10000, 2018, 1000000);
        Car car2 = new Car("Nissan", "RAV4", 10001, 2019, 1000001);
        Car car3 = new Car("Audi", "RAV4", 10002, 2020, 1000003);
        LinkedList<Car> cars = new LinkedList<Car>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        Collections.sort(cars, (Car c1, Car c2)->c2.getYear() - c1.getYear());
        assertSame(car3, cars.get(0));
        assertSame(car2, cars.get(1));
        assertSame(car1, cars.get(2));



    }


}