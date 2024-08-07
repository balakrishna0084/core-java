package com.bala.marvel.app;

import com.bala.marvel.base.Person;
import com.bala.marvel.heros.IronMan;

public class DynamicPoly {

    public static void main(String[] args) {
        Person person = new IronMan(); // upcasting
        person.walk(); // IronMan walk method is going to be invoked

        person.eat("Ice Cream");

    }
}
