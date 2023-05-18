package edu.umb.cs680.hw15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RupeesTest {
    @Test
    public void RupeesTest(){
        Convert rupees = new Convert(new Rupees());
        double result = rupees.convert(2);
        assertEquals(163d, result);
    }

}