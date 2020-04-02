package Fighters;

import Inventory.Weapons.Weapon;
import Rooms.Monster.Monster;

public class Dwarf extends Fighter {

    private int invisibilityCape;

    public Dwarf(String name, int healthPoints, int wallet, int defence, int invisibilityCape) {
        super(name, healthPoints, wallet, defence);
        this.invisibilityCape = invisibilityCape;
    }


    public void attack(Monster monster, Weapon weapon) {
        int defaultAttack = 6;
        int attack = defaultAttack + weapon.getDamage();
        monster.reduceHealthPoints(attack);
    }

    public void killBySmell(Monster monster){
        monster.reduceHealthPoints(20);
    }

}
