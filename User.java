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
        this.age = age;
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
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Weight : " + weight + " kg");
        System.out.println("Height : " + height + " cm");
    }
}
