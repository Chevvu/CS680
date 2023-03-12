package edu.umb.cs680.hw01;


import org.junit.jupiter.api.Test;

import java.util.LinkedList;


import static org.junit.jupiter.api.Assertions.*;


    class PrimeGeneratorTest {

        @Test
        public void getPrime() {

            PrimeGenerator gen = new PrimeGenerator(1, 10);
            gen.generatePrimes();
            LinkedList<Long> actual = gen.getPrimes();
            Long[] expected = {2L, 3L, 5L, 7L};
            assertArrayEquals(expected, actual.toArray());
        }

        @Test
        public void getPrimeNumbers() {
            PrimeGenerator gen = new PrimeGenerator(20, 40);
            gen.generatePrimes();
            LinkedList<Long> actual = gen.getPrimes();
            Long[] expected = {23L, 29L, 31L, 37L};
            assertArrayEquals(expected, actual.toArray());
        }

        @Test
        public void getNegativePrimes() {
            try {
                PrimeGenerator gen = new PrimeGenerator(-1, -10);
                fail("negative prime numbers");
            } catch (RuntimeException ex) {
                assertEquals("Wrong input values: from=-1 to=-10", ex.getMessage());
            }
        }

        @Test
        public void getNegNumbers() {
            try {
                PrimeGenerator gen = new PrimeGenerator(-5, 5);
                fail("negative prime numbers");
            } catch (RuntimeException ex) {
                assertEquals("Wrong input values: from=-5 to=5", ex.getMessage());

            }

        }
    }

