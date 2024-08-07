package com.bala.marvel.app;

import com.bala.marvel.animals.Cat;
import com.bala.marvel.animals.Dog;
import com.bala.marvel.base.Animal;

public class UpcastingDemo {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Scooby");
        AnimalUtility.printName(animal);

        animal = new Dog();
        animal.setName("Charlie");
        AnimalUtility.printName(animal);

        Cat cat = new Cat();
        cat.setName("Snoopy");
        AnimalUtility.printName(cat);
    }
}
