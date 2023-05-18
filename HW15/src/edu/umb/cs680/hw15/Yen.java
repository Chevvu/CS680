package edu.umb.cs680.hw15;

public class Yen implements USD{
    @Override
    public double USDtoCurrencyConvert(float dollar) {
        //USD to Yen
        return dollar*135.5 ;
    }
}
