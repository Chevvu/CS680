package edu.umb.cs680.hw02;


import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class SingletonPrimeGeneratorTest {

    @Test
    public void equal() {
        SingletonPrimeGenerator instance1 = SingletonPrimeGenerator.getInstance();
        SingletonPrimeGenerator instance2 = SingletonPrimeGenerator.getInstance();
        assertSame(instance1,instance2);
    }

    @Test
    public void notnull() {
        SingletonPrimeGenerator instance1 = SingletonPrimeGenerator.getInstance();
        assertNotNull(instance1);

    }
    @Test
    public void getNegativeNumbers() {
        try {
            SingletonPrimeGenerator instance = SingletonPrimeGenerator.getInstance();
            instance.values(-1, -10);
            fail("negative prime numbers");
        } catch (RuntimeException ex) {
            assertEquals("Wrong input values: from=-1 to=-10", ex.getMessage());
        }
    }
    @Test
    public void getPrimes() {
        SingletonPrimeGenerator instance = SingletonPrimeGenerator.getInstance();
        instance.values(20,40);
        instance.generatePrimes();
        LinkedList<Long> actual = instance.getPrimes();
        Long[] expected = {23L, 29L, 31L, 37L};
        assertArrayEquals(expected, actual.toArray());
    }
    @Test
    public void getPrimenumber() {
        try {
            SingletonPrimeGenerator instance = SingletonPrimeGenerator.getInstance();
            instance.values(-5, 5);
            fail("negative prime numbers");
        } catch (RuntimeException ex) {
            assertEquals("Wrong input values: from=-5 to=5", ex.getMessage());
        }
    }

}


