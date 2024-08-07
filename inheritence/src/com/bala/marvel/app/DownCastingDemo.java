package com.bala.marvel.app;

import com.bala.marvel.animals.Cat;
import com.bala.marvel.animals.Dog;
import com.bala.marvel.base.Animal;

public class DownCastingDemo {

    public static void main(String[] args) {

        Animal animal;
        Dog dog = new Dog();
        animal = dog;  // upcasting

        dog = (Dog) animal; // down casting

        AnimalUtility.performAction(dog);

        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
        }

    }
}
