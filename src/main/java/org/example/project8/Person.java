package org.example.project8;

public class Person {

    public Pet pet;

    public Person(Pet pet) {
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, My lovely pet");
        pet.say();
    }
}
