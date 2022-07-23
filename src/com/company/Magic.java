package com.company;

public class Magic extends Heroes {

    private int health;
    private int damage;
    private String typeOfSuperpowers;

    public Magic(int health, int damage, String typeOfSuperpowers) {
        super(health, damage, typeOfSuperpowers);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность Fire ball");
    }
}

