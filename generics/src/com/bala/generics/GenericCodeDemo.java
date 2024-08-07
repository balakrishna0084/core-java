package com.bala.generics;

public class GenericCodeDemo {

    public static void main(String[] args) {
        GenericPair<String, Integer> stringIntPair = new GenericPair<>("Hello", 42);
        String myString = stringIntPair.getFirst();
        int myInt = stringIntPair.getSecond();
        System.out.println(myString);
        System.out.println(myInt);
    }
}
