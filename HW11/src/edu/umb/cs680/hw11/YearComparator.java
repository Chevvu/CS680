package edu.umb.cs680.hw11;

import java.util.Comparator;

public class YearComparator implements Comparator<car> {
    @Override
    public int compare(car o1, car o2) {
        return o2.getYear() - o1.getYear();
    }
}
