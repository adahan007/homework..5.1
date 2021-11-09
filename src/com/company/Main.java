package com.company;

public class Main {

    public static void main(String[] args) {
        Boss adahan = new Boss();
        adahan.setHealth(1000);
        adahan.setDamage(90);
        adahan.setShield("Барьер");
        System.out.println("Adahan " + adahan.getHealth() + " XP " + adahan.getDamage() + " DD " + adahan.getShield() + " PP");

        Hero[] marvel = creatHeroes();

        for (int i = 0; i < marvel.length; i++) {

            System.out.println(marvel[i].getName() + " " + marvel[i].getDamage() + " " + marvel[i].getHealth() + " " + marvel[i].getPower());


        }
    }


    public static Hero[] creatHeroes() {

        Hero hulk = new Hero(300, 25, "forse", "hulk");
        Hero flash = new Hero(250, 30, "speed", "flash");
        Hero thor = new Hero(350, 35, "electricity", "thor");
        Hero[] marvel = {hulk, flash, thor};

        return marvel;
    }
}





