package edu.umb.cs680.hw11;

import java.util.Comparator;

public class PriceComparator implements Comparator<car> {
    @Override
    public int compare(car o1, car o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
