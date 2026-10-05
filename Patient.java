package com.mycompany.astrava;

public class Patient extends User {

    String medicalHistory;

    public Patient(String name, int age, double weight, double height, String medicalHistory) {
        super(name, age, weight, height);
        this.medicalHistory = medicalHistory;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    @Override
    public void displayHealthProfile() {
        System.out.println("Name            : " + name);
        System.out.println("Age             : " + age);
        System.out.println("Weight          : " + weight + " kg");
        System.out.println("Height          : " + height + " cm");
        System.out.println("Medical History : " + medicalHistory);
    }
}
