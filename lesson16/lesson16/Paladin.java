package lesson16;

import java.util.Random;

public class Paladin extends Warrior {
    Paladin(){}
    Paladin(String name, int damage, int hp) {
        super(name, damage, hp);

    }
    public void takeHit (Warrior war2){
        Random gen = new Random();
        int chance = gen.nextInt(10000);
        if (chance <2000){
            System.out.println("Paladin " + name + " dodge!");
        }
        else {
            super.takeHit(war2);
        }
    }
}
