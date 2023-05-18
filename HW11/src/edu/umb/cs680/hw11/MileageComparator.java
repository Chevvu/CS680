package edu.umb.cs680.hw11;

import java.util.Comparator;

public class MileageComparator implements Comparator<car> {
    @Override
    public int compare(car o1, car o2) {
        return o1.getMileage() - o2.getMileage();
    }
}
