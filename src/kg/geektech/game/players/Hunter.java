package kg.geektech.game.players;

import kg.geektech.game.boss.Boss;
import kg.geektech.game.general.AbilityType;

public class Hunter extends  Hero {
    public Hunter(int health, int damage) {
        super(health, damage, AbilityType.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        int randomIndex = (int) (Math.random()*(2+1)) + 2;
        heroes[2].setDamage(heroes[2].getDamage()*randomIndex);
       if(boss.getHealth()>0){
           System.out.println("Hunter's attack increases by:"+randomIndex);
       }
    }
}
