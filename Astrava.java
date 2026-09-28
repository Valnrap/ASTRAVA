/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.astrava;

/**
 *
 * @author Valentino Raffael
 */

public class Astrava {

    public static void main(String[] args) {

        Patient patient1 = new Patient(
                "Valentino",
                19,
                66.0,
                178.0,
                "No previous medical history"
        );

        System.out.println(" Data Pasien ");
        patient1.displayPatientProfile();

        System.out.println("\n Getter");
        System.out.println("Nama   : " + patient1.getName());
        System.out.println("Age    : " + patient1.getAge());
        System.out.println("Weight : " + patient1.getWeight() + " kg");
        System.out.println("Height : " + patient1.getHeight() + " cm");
        System.out.println("Medical History : " + patient1.getMedicalHistory());

        System.out.println("\n Setter");

        patient1.setAge(20);
        patient1.setWeight(67.0);
        patient1.setMedicalHistory("No previous medical history");

        System.out.println("Data setelah perubahan:");
        patient1.displayPatientProfile();

        System.out.println("\n Pengujian Tidak Valid!");

        patient1.setAge(-5);

        System.out.println("\nData setelah pengujian: ");
        patient1.displayPatientProfile();
    }
}
