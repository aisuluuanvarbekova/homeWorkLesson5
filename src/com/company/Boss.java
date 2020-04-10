package com.company;

public class Boss {
    private int health;
   private int damage;
    private String protection;

    public Boss(int health, int damage, String protection) {

        this.health = health;
        this.damage = damage;
        this.protection = protection;
    }

    public String getProtection() {
        return protection;
    }

    public void setProtection(String protection) {
        this.protection = protection;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
