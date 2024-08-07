package com.bala.object.demo;

public class ImmutableDemo {

    public static void main(String[] args) {
        ImmutablePerson immutablePerson = new ImmutablePerson("John", "Software Engineer");
        System.out.println(immutablePerson.getOccupation());
    }
}
