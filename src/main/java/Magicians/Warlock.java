package Magicians;

import Inventory.Creatures.Creature;
import Inventory.Spells.Spell;
import Rooms.Monster.Monster;

public class Warlock extends Magic {


    public Warlock(Spell spell, Creature creature, int defence) {
        super(spell, creature, defence);
    }

    public void attack(Monster monster, Spell spell) {
        int defaultAttack = 10;
        int attack = defaultAttack + spell.getDamage();
        monster.reduceHealthPoints(attack);
    }

//    public void darkMagic(){
//
//    }
//
//    public void callSpirit(){
//
//        this.defence += 10;
//
//    }


}
