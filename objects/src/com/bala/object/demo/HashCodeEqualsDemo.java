package com.bala.object.demo;

public class HashCodeEqualsDemo {

    public static void main(String[] args) {
        Person p1 = new Person("John", 25, 'M', 56423314);
        Person p2 = new Person("John", 25, 'M', 56423314);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));
    }
}
