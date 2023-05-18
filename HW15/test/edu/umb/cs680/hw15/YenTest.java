package edu.umb.cs680.hw15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YenTest {
    @Test
    public void yenTest(){
        Convert yen = new Convert(new Yen());
        double result = yen.convert(2);
        assertEquals(271d, result);
    }

}