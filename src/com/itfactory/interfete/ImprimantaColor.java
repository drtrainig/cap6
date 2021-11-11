package com.itfactory.interfete;

public class ImprimantaColor implements Imprimanta {

    @Override
    public void printeaza(String textDePrintat) {
        System.out.println("Am printat textul color: " + textDePrintat);
    }
}
