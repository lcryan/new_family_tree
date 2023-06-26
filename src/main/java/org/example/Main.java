package org.example;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person Maribel = new Person("Maribel", "Madrigal", 22, "female");
        Pet Bruno = new Pet("Bruno", 2, "monkey");
        Person Kiara = new Person("Kiara", "Madrigal", 13, "male");
        System.out.println(Maribel.getAge());
        System.out.println(Bruno.getSpecies());
    }
}
