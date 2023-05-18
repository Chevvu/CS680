package edu.umb.cs680.hw10;

import edu.umb.cs680.hw10.Car;
import edu.umb.cs680.hw10.distance.Distance;
import edu.umb.cs680.hw10.distance.Manhattan;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ManhattanTest {
    private LinkedList<Double> getCarLst(Car c){
        return new LinkedList<>(Arrays.asList((double)c.getMileage(), (double)c.getYear(), (double)c.getPrice()));
    }
    Car c1 = new Car("Nissan", "WagonR", 2015, 17, 100000);
    Car c2 = new Car("Suzuki", "Baleno", 2016, 18, 100001);
    Car c3 = new Car("Maruti", "Swift", 2017, 19, 100002);
    @Test
    public void Manhattan(){
        List<List<Double>> expected = new ArrayList<>();
        List<Double> pt1 = new ArrayList<>();
        pt1.add(0.0);
        pt1.add(3.0);
        pt1.add(6.0);
        List<Double> pt2 = new ArrayList<>();
        pt2.add(3.0);
        pt2.add(0.0);
        pt2.add(3.0);
        List<Double> pt3 = new ArrayList<>();
        pt3.add(6.0);
        pt3.add(3.0);
        pt3.add(0.0);
        expected.add(pt1);
        expected.add(pt2);
        expected.add(pt3);
        List<Double> carList1 = getCarLst(c1);
        List<Double> carList2 = getCarLst(c2);
        List<Double> carList3 = getCarLst(c3);
        List<List<Double>> points = new ArrayList<>();
        points.add(carList1);
        points.add(carList2);
        points.add(carList3);
        List<List<Double>> normalized = Normalization.getNormalizedValues(points);
        List<List<Double>> actual = Distance.matrix(points, new Manhattan());
        assertArrayEquals(expected.toArray(), actual.toArray());
    }


}