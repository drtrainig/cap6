package com.itfactory.mostenire;

public class Profesor extends Person {

    private double salary;
    private String curs;

    public Profesor(String name, String phoneNumber, String emailAddress, double salary, String curs) {
        super(name, phoneNumber, emailAddress);
        this.salary = salary;
        this.curs = curs;
    }

    public void afiseazaDatePrfesor() {
        super.afiseazaDatePersoana();
        System.out.println("Date profesor:" +
                "\nSalariu: " + this.salary +
                "\nCurs: " + this.curs
                + "\n--------------");
    }

}
