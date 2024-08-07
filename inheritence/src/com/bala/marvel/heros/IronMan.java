package com.bala.marvel.heros;

import com.bala.marvel.base.Person;

public class IronMan extends Person {

    public void usePower(){
        System.out.println("IronMan is using his power");
    }

    @Override
    public void walk(){
        System.out.println("IronMan walking with his suite");
    }

    @Override
    public void eat(String food){
        super.eat("Pasta");
        System.out.println("IronMan is eating the food: "+food);
    }

    // eat, String
    // eat,
    // eat, String, int
    // eat, int, String
    public void eat(){
        System.out.println("Method overloading 1");
    }

    public void eat(String food, int quantity){
        System.out.println("Method overloading 2");
    }

    public void eat(int quantity, String food){
        System.out.println("Method overloading 3");
    }

    public void callOverriddenEatMethod(){
        super.eat("Pasta");
    }
}
