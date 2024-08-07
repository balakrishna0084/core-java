package com.bala.marvel.hero.impl;

import com.bala.marvel.hero.SuperHero;

public class IronMan implements SuperHero {

    @Override
    public String usePower() {
        System.out.println(UNIVERSE_NAME);
        return "IronMan using his power";
    }

    @Override
    public String stopVillain(char c) {
        if(c=='Y'){
            return "IronMan killed the Villain";
        }else{
            return "IronMan stopped the Villain";
        }
    }
}
