package edu.umb.cs680.hw11;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class ParetoComparatorTest {
    @Test
    public void ParetoTest(){
        car car1 = new car("Toyota", "RAV4", 10000, 2018, 1000000);
        car car2 = new car("Nissan", "RAV4", 10001, 2019, 1000001);
        car car3 = new car("Audi", "RAV4", 10002, 2020, 1000003);
        LinkedList<car> cars = new LinkedList<car>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        Collections.sort(cars, new ParetoComparator());
        assertSame(car3, cars.get(2));
        assertSame(car2, cars.get(1));
        assertSame(car1, cars.get(0));


    }

}