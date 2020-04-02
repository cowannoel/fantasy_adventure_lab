package Fighters;

import Inventory.Weapons.Weapon;
import Rooms.Monster.Monster;

public class Dwarf extends Fighter {

    private int invisibilityCape;

    public Dwarf(String name, Weapon weapon, int defence, int invisibilityCape) {
        super(name, weapon, defence);
        this.invisibilityCape = invisibilityCape;
    }

    public void attack(Monster monster, Weapon weapon) {
        int defaultAttack = 6;
        int attack = defaultAttack + weapon.damage();
        monster.reduceHealthPoints(attack);
    }

    public void killBySmell(Monster monster){
        monster.reduceHealthPoints(20);
    }

}
