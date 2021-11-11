package com.itfactory.claseabstracte;

public abstract class SchimbValutar {

    abstract double cursDeSchimbEuro();

    public double schimbaBaniInRon(double euro) {
        return euro * cursDeSchimbEuro();
    }
}
