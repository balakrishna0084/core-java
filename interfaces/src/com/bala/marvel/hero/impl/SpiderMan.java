package com.bala.marvel.hero.impl;

import com.bala.marvel.hero.SuperHero;

public class SpiderMan implements SuperHero {

    @Override
    public String usePower() {
        return "SpiderMan using his power";
    }

    @Override
    public String stopVillain(char c) {
        if(c=='Y'){
            return "SpiderMan killed the Villain";
        }else{
            return "SpiderMan stopped the Villain";
        }
    }

    @Override
     public String trackLiveLocation(){
        String liveLocation = "London";
        System.out.println("I am in "+liveLocation);
        return liveLocation;
    }
}
