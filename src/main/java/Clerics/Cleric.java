package Clerics;

import Inventory.Healing.HealingTools;
import Player.Player;

public class Cleric extends Player {

    private String name;
    private HealingTools healingTools;
    private int defence;

    public Cleric(String name, int healthPoints, int wallet, HealingTools healingTools, int defence) {
        super(name, healthPoints, wallet);
        this.healingTools = healingTools;
        this.defence = defence;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HealingTools getHealingTools() {
        return healingTools;
    }

    public void changeHealingTools(HealingTools healingTools) {
        this.healingTools = healingTools;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void healSelf(){}

}
