package com.itfactory.interfete;

public class Rocri implements SchimbValutar {
    @Override
    public double cursDeSchimbEuro() {
        return 0;
    }

    @Override
    public double schimbaBaniInRon(double euro) {
        return euro * cursDeSchimbEuro();
    }
}
