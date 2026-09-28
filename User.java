/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.astrava;

/**
 *
 * @author Valentino Raffael
 */

public class User {

    private String name;
    private int age;
    private double weight;
    private double height;

    public User(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age tidak valid. Age harus lebih dari 0.");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
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
