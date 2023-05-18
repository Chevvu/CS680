package edu.umb.cs680.hw16_1;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LineChartObserverTest {
    @Test
    public void LineChartObserverTest(){
        StockQuoteObservable stockQuoteObservable = new StockQuoteObservable();
        stockQuoteObservable.addObserver(new LineChartObserver());
        stockQuoteObservable.changeQuote("t2", 62.0);
        Map<String, Double> expected = new HashMap<>();
        expected.put("t2", 62.0);
        assertEquals(expected.get("t2"), stockQuoteObservable.getMap_().get("t2"));
        assertTrue(stockQuoteObservable.getMap_().containsKey("t2"));
    }

}