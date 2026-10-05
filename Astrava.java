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

        User user = new User(
            "Valentino",
            19,
            66.0,
            178.0,
        );

        User patient = new Patient(
            "Valentino",
            19,
            66.0,
            178.0,
            "No previous medical history"
        );

        System.out.println("=== USER PROFILE ===");
        user.displayHealthProfile();

        System.out.println("\n=== PATIENT PROFILE ===");
        patient.displayHealthProfile();
    }
}
