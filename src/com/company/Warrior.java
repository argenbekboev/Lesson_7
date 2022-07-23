package com.company;

public class Warrior extends Heroes {

    private int health;
    private int damage;
    private int typeOfSuperpowers;


    public Warrior(int health, int damage, String typeOfSuperpowers) {
        super(health, damage, typeOfSuperpowers);
    }


    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");
    }
}

