package Fighters;

import Inventory.Weapons.Weapon;
import Rooms.Monster.Monster;

public class Barbarian extends Fighter {


    public Barbarian(String name, int healthPoints, int wallet, int defence) {
        super(name, healthPoints, wallet, defence);
    }

    public void attack(Monster monster, Weapon weapon) {
        int defaultAttack = 20;
        int attack = defaultAttack + weapon.getDamage();
        monster.reduceHealthPoints(attack);
    }
    
    public void doubleAttack(Monster monster, Weapon weapon){
        int defaultAttack = 20;
        int attack = defaultAttack + weapon.getDamage() * 2;
        monster.reduceHealthPoints(attack);
    }



}
