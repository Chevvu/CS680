package edu.umb.cs680.hw16_1;

import java.util.HashMap;
import java.util.Map;

public class StockQuoteObservable extends Observable<StockEvent>{
    Map<String, Double> map_ = new HashMap<>();
    public void changeQuote(String ticker, double quote){
        map_.put(ticker, quote);
        notifyObservers(new StockEvent(ticker, quote));
    }

    public Map<String, Double> getMap_() {
        return map_;
    }
}
