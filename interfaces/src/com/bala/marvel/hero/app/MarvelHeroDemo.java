package com.bala.marvel.hero.app;

import com.bala.marvel.hero.SuperHero;
import com.bala.marvel.hero.impl.CaptainAmerica;
import com.bala.marvel.hero.impl.Developer;
import com.bala.marvel.hero.impl.IronMan;
import com.bala.marvel.hero.impl.SpiderMan;

public class MarvelHeroDemo {

    public static void main(String[] args) {

        System.out.println(SuperHero.UNIVERSE_NAME);

        SuperHero ironMan = new IronMan();
        invokeSuperHero(ironMan);

        SuperHero spiderMan = new SpiderMan();
        invokeSuperHero(spiderMan);

        SuperHero captainAmerica = new CaptainAmerica();
        invokeSuperHero(captainAmerica);

        Developer developer = new Developer();
        developer.walk();
    }

    private static void invokeSuperHero(SuperHero superHero){
        System.out.println(superHero.usePower());
        System.out.println(superHero.stopVillain('N'));
    }
}
