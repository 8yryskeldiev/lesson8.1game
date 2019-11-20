package kg.geektech.game.players;

import kg.geektech.game.boss.Boss;
import kg.geektech.game.general.AbilityType;

public class Medical extends  Hero {
    private  int healPoints;
    public Medical(int health, int damage) {
        super(health, damage, AbilityType.HEAL);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
          heroes[i].setHealth( heroes[i].getHealth()+ healPoints);
        }
        if(boss.getHealth()>0){
        System.out.println("The Medic provides medical care:" +" "+"+10 to Health all Heroes");
        }

    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }
}
