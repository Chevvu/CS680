package edu.umb.cs680.hw16_1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TableObservableTest {
    @Test
    public void TableObservableTest(){
        StockQuoteObservable stockQuoteObservable = new StockQuoteObservable();
        stockQuoteObservable.addObserver(new TableObserver());
        stockQuoteObservable.changeQuote("t1", 61.0);
        Map<String, Double> expected = new HashMap<>();
        expected.put("t1", 61.0);
        assertEquals(expected.get("t1"), stockQuoteObservable.getMap_().get("t1"));
        assertTrue(stockQuoteObservable.getMap_().containsKey("t1"));
    }

}