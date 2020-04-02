package Fighters;

import Inventory.Weapons.Weapon;
import Rooms.Monster.Monster;

public class Knight extends Fighter  {

    private int shield;
    private int armour;


    public Knight(String name, Weapon weapon, int defence, int shield, int armour) {
        super(name, weapon, defence);
        this.shield = shield;
        this.armour = armour;
    }

    public void attack(Monster monster, Weapon weapon) {
        int defaultAttack = 10;
        int attack = defaultAttack + weapon.damage();
        monster.reduceHealthPoints(attack);
    }

    public int getShield() {
        return shield;
    }

    public int getArmour() {
        return armour;
    }
}
