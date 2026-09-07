/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.astrava;

/**
 *
 * @author hangineering
 */
public class User {
    
    String name;
    int age;
    double weight;
    double height;

    public User(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void displayHealthProfile() {
        System.out.println("==== ASTRAVA HEALTH PROFILE =====");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age + " years");
        System.out.println("Weight : " + weight + " kg");
        System.out.println("Height : " + height + " cm");
    }
}
