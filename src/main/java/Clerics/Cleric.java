package Clerics;

import Inventory.Healing.HealingTools;

public class Cleric {

    private String name;
    private HealingTools healingTools;
    private int defence;

    public Cleric(String name, HealingTools healingTools, int defence){
        this.name = name;
        this. healingTools = healingTools;
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
