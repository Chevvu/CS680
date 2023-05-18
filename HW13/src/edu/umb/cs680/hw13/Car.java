package edu.umb.cs680.hw13;

import java.util.LinkedList;

public class Car {
    private String make,model;
    private int mileage,year;
    private float price;
    private int domination;

    public Car(String make,String model,int mileage,int year,float price) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.year = year;
        this.price = price;
    }


    public String getMake() {
        return this.make;
    }
    public String getModel() {
        return this.model;
    }
    public int getMileage() {
        return this.mileage;
    }
    public int getYear() {
        return this.year;
    }
    public float getPrice() {
        return this.price;
    }

    public void setDominationCount(LinkedList<Car> usedCars){
        int tracker = 0;
        for (Car c: usedCars ){
            if (!c.equals(this)){
                if((this.getYear() >= c.getYear()) && (this.getMileage() <= c.getMileage()) && (this.getPrice()<=c.getPrice())){
                    if((this.getYear() > c.getYear()) || (this.getMileage() < c.getMileage()) || (this.getPrice()<c.getPrice())){
                        tracker++;
                    }
                }
            }
        }
        this.domination = tracker;
    }
    public int getDominationCount(){
        return domination;
    }

}


