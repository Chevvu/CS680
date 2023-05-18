package edu.umb.cs680.hw16_2;

import java.util.HashMap;
import java.util.Map;

public class StockQuoteObservable extends Observable<StockEvent>{
    Map<String, Double> map_of_Stock_Event = new HashMap<>();
    public void changeQuote(String ticker, double quote){
        map_of_Stock_Event.put(ticker, quote);
        notifyObservers(new StockEvent(ticker, quote));
    }

    public Map<String, Double> getMap_of_Stock_Event() {
        return map_of_Stock_Event;
    }
}
