package com.itfactory.interfete;

public class ImprimantaAlbNegru implements Imprimanta {

    @Override
    public void printeaza(String textDePrintat) {
        System.out.println("Am printat textul alb negru: " + textDePrintat);
    }
}
