package edu.umb.cs680.hw13;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class PriceComparator {
    @Test
    public void PriceTest(){
        Car car1 = new Car("Toyota", "RAV4", 10000, 2018, 1000000);
        Car car2 = new Car("Nissan", "RAV4", 10001, 2019, 1000001);
        Car car3 = new Car("Audi", "RAV4", 10002, 2020, 1000003);
        LinkedList<Car> cars = new LinkedList<Car>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.sort((Car c1, Car c2) -> (int) (c1.getPrice() - c2.getPrice()));
        assertSame(car3, cars.get(2));
        assertSame(car2, cars.get(1));
        assertSame(car1, cars.get(0));



    }

}