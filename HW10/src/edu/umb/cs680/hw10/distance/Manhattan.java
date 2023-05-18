package edu.umb.cs680.hw10.distance;
import java.util.List;

public class Manhattan implements DistanceMetric{

    @Override
    public double distance(List<Double> p1, List<Double> p2) {
        double distance = 0d;
        if(p1.size() == p2.size()){
            for(int i = 0; i < p1.size(); i++){
                distance = distance + Math.abs(p1.get(i) - p2.get(i));
            }
            return distance;
        } else {
            return -1;
        }

    }
}