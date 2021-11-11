package com.itfactory.mostenire;

public class Secretary extends Person {

    private double salary;

    public Secretary(String name, String phoneNumber, String emailAddress, double salary) {
        super(name, phoneNumber, emailAddress);
        this.salary = salary;
    }


    public void afiseazaDateSecretara() {
        super.afiseazaDatePersoana();
        System.out.println("Date secretar:" +
                "\nSalariu: " + this.salary
                + "\n--------------");
    }

}
