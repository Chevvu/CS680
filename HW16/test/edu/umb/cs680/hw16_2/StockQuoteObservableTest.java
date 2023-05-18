package edu.umb.cs680.hw16_2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StockQuoteObservableTest {
    @Test
    public void StockQuoteObservableUsingLambda(){
        StockQuoteObservable stockQuoteObservable = new StockQuoteObservable();
        stockQuoteObservable.addObserver((StockEvent1, event)->{
            System.out.println("3D Observer");
            System.out.println(event.getQuote());
            System.out.println(event.getTicker());
        });

        stockQuoteObservable.addObserver((StockEvent1, event)->{
            System.out.println("LineChart Observer");
            System.out.println(event.getQuote());
            System.out.println(event.getTicker());
        });
        stockQuoteObservable.addObserver((StockEvent1, event)->{
            System.out.println("Table Observer");
            System.out.println(event.getQuote());
            System.out.println(event.getTicker());
        });
        stockQuoteObservable.changeQuote("t1", 60.0);
        Map<String, Double> expected = new HashMap<>();
        expected.put("t1", 60.0);
        assertEquals(expected.get("t1"), stockQuoteObservable.getMap_of_Stock_Event().get("t1"));
    }

}