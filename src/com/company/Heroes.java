package com.company;

public abstract class Heroes implements HavingSuperAbility {

    private int health;
    private int damage;
    private String typeOfSuperpowers;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeOfSuperpowers() {
        return typeOfSuperpowers;
    }

    public void setTypeOfSuperpowers(String typeOfSuperpowers) {
        this.typeOfSuperpowers = typeOfSuperpowers;
    }

    public Heroes(int health, int damage, String typeOfSuperpowers) {
        this.health = health;
        this.damage = damage;
        this.typeOfSuperpowers = typeOfSuperpowers;
    }
    private int Health;

    private int Damage;

    private String TypeOfSuperpowers;

}
