package edu.umb.cs680.hw15;

public class Convert {
    private USD usd;
    Convert(USD usd){
        this.usd = usd;
    }
    public double convert(float usdollar){
        return usd.USDtoCurrencyConvert(usdollar);
    }
}
