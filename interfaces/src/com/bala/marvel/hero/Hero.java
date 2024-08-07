package com.bala.marvel.hero;

public interface Hero {

    default void walk(){
        System.out.println("Walking");
    }
}
