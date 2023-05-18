package edu.umb.cs680.hw10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Car {
    private String make, model;
    private int mileage, year;
    private float price;
    public Car(String make, String model, int mileage, int year, float price){
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public float getPrice() {
        return price;
    }

}
