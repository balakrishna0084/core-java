package com.bala.marvel.hero.impl;

import com.bala.marvel.hero.SuperHero;

public class CaptainAmerica implements SuperHero {

    @Override
    public String usePower() {
        return "CaptainAmerica using his power";
    }

    @Override
    public String stopVillain(char c) {
        if(c=='Y'){
            return "CaptainAmerica killed the Villain";
        }else{
            return "CaptainAmerica stopped the Villain";
        }
    }
}
