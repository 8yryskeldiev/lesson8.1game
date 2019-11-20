package kg.geektech.game.players;

import kg.geektech.game.boss.Boss;
import kg.geektech.game.general.AbilityType;

import java.util.Random;

public class Magic extends Hero {


    public Magic(int health, int damage) {
        super(health, damage, AbilityType.BOOST);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        Random random = new Random(1);
        int coefficient = random.nextInt(10);
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + coefficient);
        }

        if (boss.getHealth() > 0) {
            System.out.println("Sorcerer's help to Damage:  " + "+ " + coefficient);
        } else {
            System.out.println("The Ability of Mag not active");

        }
    }
}


