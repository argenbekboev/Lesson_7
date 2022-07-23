package com.company;

public class Medic extends Heroes {


    public Medic(int health, int damage, String typeOfSuperpowers) {
        super(health, damage, typeOfSuperpowers);
    }

    public int healPoints;
    public int increaseExperience;

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность All heroes healthing");
    }
}

