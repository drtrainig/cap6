package com.itfactory.mostenire;

public class Student extends Person {

    private int studentNumber;

    public Student(String name, String phoneNumber, String emailAddress, int studentNumber) {
        super(name, phoneNumber, emailAddress);
        this.studentNumber = studentNumber;
    }

    public void afiseazaDateStudent() {
        super.afiseazaDatePersoana();
        System.out.println("Date student:" +
                "\nNumar student: " + this.studentNumber
                + "\n--------------");
    }
}
