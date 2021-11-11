package com.itfactory.claseabstracte;

public class Main {
    public static void main(String[] args) {

        SchimbValutar rocri = new Rocri();
        SchimbValutar schimbBt = new SchimbBt();

        System.out.println(rocri.schimbaBaniInRon(100));
        System.out.println(schimbBt.schimbaBaniInRon(100));
    }
}
