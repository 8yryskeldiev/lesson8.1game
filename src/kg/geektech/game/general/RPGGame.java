package kg.geektech.game.general;

import kg.geektech.game.boss.Boss;
import kg.geektech.game.players.*;

public class RPGGame {
    public static void startGame() {

        Boss boss = new Boss(900, 80);
        Warrior  warrior = new Warrior(350, 20);
        Medical medical = new Medical(350, 20);
        medical.setHealPoints(30);
        Magic magic = new Magic(350, 20);
        Hunter hunter = new Hunter(350, 20);
        Hero[] heroes = {warrior, medical, hunter, magic};
        printStatisticks(heroes, boss);
        while (!isFinished(heroes, boss)) {
            round(heroes, boss);
        }
    }

    private static void round(Hero[] heroes, Boss boss) {
        heroesHit(heroes, boss);
        bossHit(heroes, boss);
        printStatisticks(heroes, boss);
        heroesUseSuperAbilities(heroes, boss);
        returnInformation(heroes, boss);
    }

    private static boolean isFinished(Hero[] heroes, Boss boss) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes woon");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }

        }
        if (allHeroesDead) {
            System.out.println("Boss woooon");
        }
        return allHeroesDead;
    }


    private static void bossHit(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage());

        }
        System.out.println("Boss attack");
    }

    private static void heroesHit(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if(boss.getHealth()>0){
            boss.setHealth(boss.getHealth() - heroes[i].getDamage());
            }
else {
                System.out.println("The Boss is dead");

            }
        }
        System.out.println("Heroes attacks");
    }

    private static void printStatisticks(Hero[] heroes, Boss boss) {
        System.out.println("_______________________________");

        System.out.println("Boss health" + boss.getHealth());

        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getClass().getSimpleName() + "  health" + heroes[i].getHealth());
        }

        System.out.println("_______________________________");
    }


    private static void heroesUseSuperAbilities(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].useAbility(heroes, boss);

        }
    } private static void returnInformation(Hero[] heroes, Boss boss) {
        if(heroes[0].getDamage()>40) {
            heroes[0].setDamage(heroes[0].getDamage() - boss.getDamage());
        }


    }



}
