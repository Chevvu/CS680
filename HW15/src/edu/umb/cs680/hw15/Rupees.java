package edu.umb.cs680.hw15;

public class Rupees implements USD{
    @Override
    public double USDtoCurrencyConvert(float dollar) {
        return dollar*81.5;
    }
}
