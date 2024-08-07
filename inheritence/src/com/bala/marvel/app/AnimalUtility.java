package com.bala.marvel.app;

import com.bala.marvel.animals.Cat;
import com.bala.marvel.animals.Dog;
import com.bala.marvel.base.Animal;

public class AnimalUtility {

    public static void printName(Animal animal){
        System.out.println(animal.getName());
        animal.eat();
    }

    public static void performAction(Animal animal){
       animal.eat();

       if(animal instanceof Dog){    // Old Syntax
           Dog dog = (Dog)animal;
           dog.bark();
       }else if(animal instanceof Cat cat){   // New Syntax Java 16
           cat.meow();
       }

    }
}
