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

        User user1 = new User(
                "Valentino",
                19,
                66.0,
                178.0
        );

        System.out.println("Data Awal:");
        user1.displayHealthProfile();

        System.out.println("\n=== Menggunakan Getter ===");
        System.out.println("Nama   : " + user1.getName());
        System.out.println("Age    : " + user1.getAge());
        System.out.println("Weight : " + user1.getWeight() + " kg");
        System.out.println("Height : " + user1.getHeight() + " cm");

        System.out.println("\n=== Mengubah Data dengan Setter ===");

        user1.setAge(20);
        user1.setWeight(67.0);

        System.out.println("Data setelah perubahan:");
        user1.displayHealthProfile();

        System.out.println("\n=== Pengujian Data Tidak Valid ===");
        user1.setAge(-5);

        System.out.println("\nData setelah pengujian:");
        user1.displayHealthProfile();
    }
}
