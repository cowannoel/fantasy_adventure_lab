package Magicians;
import Inventory.Creatures.Creature;
import Inventory.Spells.Spell;
import Rooms.Monster.Monster;

public abstract class Magic {

    private Spell spell;
    private Creature creature;
    private int defence;

    public Magic(Spell spell, Creature creature, int defence){
        this.spell = spell;
        this.creature = creature;
        this.defence = defence;
    }


    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public Creature getCreature() {
        return creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public abstract void attack(Monster monster, Spell spell);
}
