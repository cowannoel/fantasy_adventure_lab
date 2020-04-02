package Fighters;

import Inventory.Weapons.Weapon;
import Rooms.Monster.Monster;

public class Barbarian extends Fighter {

    public Barbarian(String name, Weapon weapon, int defence) {
        super(name, weapon, defence);
    }

    public void attack(Monster monster, Weapon weapon) {
        int defaultAttack = 20;
        int attack = defaultAttack + weapon.damage();
        monster.reduceHealthPoints(attack);
    }
    
    public void doubleAttack(Monster monster, Weapon weapon){
        int defaultAttack = 20;
        int attack = defaultAttack + weapon.damage() * 2;
        monster.reduceHealthPoints(attack);
    }



}
