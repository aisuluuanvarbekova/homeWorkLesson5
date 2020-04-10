package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.health = 100;
        boss.damage = 150;
        boss.protection = superPower;
        System.out.println(boss.health + " " + boss.damage + " " + boss.protection);


        Boss boss = new Boss()
        boss.getHealth(100)
        boss.getDamage(150);
        boss.getProtection(superPower);
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getProtection());


    }
}
