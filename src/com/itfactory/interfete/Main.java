package com.itfactory.interfete;

public class Main {
    public static void main(String[] args) {
        Imprimanta imprimantaColor = new ImprimantaColor();
        Imprimanta imprimantaAlbNegru = new ImprimantaAlbNegru();

        imprimantaAlbNegru.printeaza("Dragos Roban");
        imprimantaColor.printeaza("Dragos Roban");
    }
}
