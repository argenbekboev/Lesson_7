package com.company;

public class Main {

    public void main(String[] args) {

        Magic magic = new Magic(350, 50, "Fire");

        Medic medic = new Medic(350, 0, "Treatment");

        Warrior warrior = new Warrior(350, 50, "Critical damage");

        int[] health = {magic.getHealth(), medic.getHealth(), warrior.getHealth()};

        for (int i = 0; i < health.length; i++) {
        health[i] = (int) (medic.increaseExperience * 0.1);

        }

    }

}

