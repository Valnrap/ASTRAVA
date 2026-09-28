package com.mycompany.astrava;

public class Patient extends User {
    private String medicalHistory;

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

    public void displayPatientProfile() {
        displayHealthProfile();
        System.out.println("Medical History : " + medicalHistory);
    }
}
