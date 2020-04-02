package Magicians;

import Inventory.Creatures.Creature;
import Inventory.Spells.Spell;
import Rooms.Monster.Monster;

public class Wizard extends Magic {


    public Wizard(Spell spell, Creature creature, int defence) {
        super(spell, creature, defence);
    }

    public void attack(Monster monster, Spell spell) {
        int defaultAttack = 10;
        int attack = defaultAttack + spell.getDamage();
        monster.reduceHealthPoints(attack);
    }

}
