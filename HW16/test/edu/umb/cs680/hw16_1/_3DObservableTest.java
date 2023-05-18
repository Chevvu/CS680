package edu.umb.cs680.hw16_1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class _3DObservableTest {
    @Test
    public void _3DObservableTest(){
        StockQuoteObservable stockQuoteObservable = new StockQuoteObservable();
        stockQuoteObservable.addObserver(new _3DObserver());
        stockQuoteObservable.changeQuote("t3", 63.0);
        Map<String, Double> expected = new HashMap<>();
        expected.put("t3", 63.0);
        assertEquals(expected.get("t3"), stockQuoteObservable.getMap_().get("t3"));
        assertTrue(expected.containsKey("t3"));
        stockQuoteObservable.changeQuote("t4", 63.0);
        Map<String, Double> expected1 = new HashMap<>();
        expected1.put("t4", 63.0);
        assertEquals(expected1.get("t4"), stockQuoteObservable.getMap_().get("t4"));
        assertTrue(expected1.containsKey("t4"));
    }

}