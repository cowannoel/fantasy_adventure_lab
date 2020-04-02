package Fighters;

import Inventory.Weapons.Weapon;
import Rooms.Monster.Monster;

public class Knight extends Fighter  {

    private int shield;
    private int armour;

    public Knight(String name, int healthPoints, int wallet, int defence) {
        super(name, healthPoints, wallet, defence);
        this.shield = shield;
        this.armour = armour;
    }


    public void attack(Monster monster, Weapon weapon) {
        int defaultAttack = 10;
        int attack = defaultAttack + weapon.getDamage();
        monster.reduceHealthPoints(attack);
        monster.reduceDefencePoints(attack);
    }

    public int getShield() {
        return shield;
    }

    public int getArmour() {
        return armour;
    }
}
