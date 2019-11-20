package kg.geektech.game.players;

import kg.geektech.game.boss.Boss;
import kg.geektech.game.general.AbilityType;

public class Warrior extends  Hero {
    public Warrior(int health, int damage) {
        super(health, damage, AbilityType.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        if (heroes[0].getHealth() < 350) { //тут такая логика ,чтобы он бил только после получения урона,а так как сначала бьют герои первоначьная атака равна 10.
           heroes[0].setDamage(heroes[0].getDamage() + boss.getDamage());
        }
if (boss.getHealth()>0){
        System.out.println("The Ability of Warrior is working"+ "  " +"The totlal Damage of Warrior is 40 ");
}

    }
}
