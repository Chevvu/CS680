package edu.umb.cs680.hw03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class carTest {
    private String[] carToStringArray(car c) {
        String[] carInfo = {c.getMake(), c.getModel(), String.valueOf(c.getYear())};
        return carInfo;
    }

    @Test
          public void car() {
                  String[] expected = {"Toyota", "RAV4", "2018"};
                  car actual = new car("Toyota", "RAV4", 10000, 2018, 1000000);
                  assertArrayEquals(expected, carToStringArray(actual));
            }
}
