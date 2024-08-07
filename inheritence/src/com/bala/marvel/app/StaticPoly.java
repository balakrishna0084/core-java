package com.bala.marvel.app;

import com.bala.marvel.heros.IronMan;

public class StaticPoly {

    public static void main(String[] args) {

        IronMan ironMan = new IronMan();
        ironMan.eat("Pasta");
        ironMan.eat("Pasta", 1);
    }
}
