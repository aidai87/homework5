package com.aidai;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossDamage(50);
        boss.setBossHealth(100);
        boss.setBossDefence("Maybl");
        System.out.println("Boss Damage-" + boss.getBossDamage() + " " + "Boss Health-" + boss.getBossHealth() + " " + "Boss Defence-" + boss.getBossDefence());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHeroesHealth() + " " + createHeroes()[i].getHeroesDamage() + " " + createHeroes()[i].getHeroesAttackType());

        }
    }

    public static Hero[] createHeroes() {
        Hero Thor = new Hero(250, 30, "Thor");
        Hero Magical = new Hero(150, 20, "Magical");
        Hero Maybl = new Hero(150, 25, "Maybl");
        Hero[] heroMassive = {Thor , Magical, Maybl};
        return heroMassive;
    }
}


