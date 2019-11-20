package kg.geektech.game.general;

import java.util.Random;

public abstract class GameEntity  {
    private  int health;
    private  int damage;


    public GameEntity(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;

    }

    public int setDamage(int damage) {
        this.damage = damage;
        return damage;
    }



}
