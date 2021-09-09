package com.aidai;
public class Hero {
    private int heroesHealth;
    private int heroesDamage;
    private String heroesAttackType;

    public Hero(int heroesHealth, int heroesDamage, String heroesAttackType) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
        this.heroesAttackType = heroesAttackType;
    }

    public Hero(int heroesHealth, int heroesDamage) {
        this.heroesHealth = heroesHealth;
        this.heroesDamage = heroesDamage;
    }

    public int getHeroesHealth() {
        return heroesHealth;
    }

    public int getHeroesDamage() {
        return heroesDamage;
    }

    public String getHeroesAttackType() {
        return heroesAttackType;
    }
}


