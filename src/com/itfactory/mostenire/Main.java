package com.itfactory.mostenire;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Dragos Roban", "0756914269", "dragos.roban.training@gmail.com", 12212);
        Profesor profesor = new Profesor("Profesor", "0756914262", "profesor@gmail.com", 5500.5, "Java");
        Secretary secretara = new Secretary("Secretara", "01231312", "secretariat@gmail.com", 3500);

        student.afiseazaDateStudent();
        profesor.afiseazaDatePrfesor();
        secretara.afiseazaDateSecretara();
    }
}
