package edu.umb.cs680.hw10;

import java.util.ArrayList;
import java.util.List;

public class Normalization {

    public static List<List<Double>> getNormalizedValues(List<List<Double>> points) {
        List<List<Double>> normalizedCarList = new ArrayList<>();

        // Find the maximum values for mileage, year, and price
        double mileageMax = Double.MIN_VALUE;
        double yearMax = Double.MIN_VALUE;
        double priceMax = Double.MIN_VALUE;
        for (List<Double> carData : points) {
            double mileage = carData.get(0);
            double year = carData.get(1);
            double price = carData.get(2);

            mileageMax = Math.max(mileageMax, mileage);
            yearMax = Math.max(yearMax, year);
            priceMax = Math.max(priceMax, price);
        }

        // Normalize the car data and add it to the normalizedCarList
        for (List<Double> carData : points) {
            List<Double> normalizedCarData = new ArrayList<>();

            double mileage = carData.get(0);
            double year = carData.get(1);
            double price = carData.get(2);

            double normalizedMileage = mileage / mileageMax;
            double normalizedYear = year / yearMax;
            double normalizedPrice = price / priceMax;

            normalizedCarData.add(normalizedMileage);
            normalizedCarData.add(normalizedYear);
            normalizedCarData.add(normalizedPrice);

            normalizedCarList.add(normalizedCarData);
        }

        return normalizedCarList;
    }
}
