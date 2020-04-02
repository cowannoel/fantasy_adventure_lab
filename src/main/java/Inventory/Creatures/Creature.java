package Inventory.Creatures;

public abstract class Creature {

    private int additionalDefence;
    private String name;

    public Creature(int additionalDefence, String name){
        this.additionalDefence = additionalDefence;
        this.name = name;

    }

    public int getAdditionalDefence() {
        return additionalDefence;
    }

    public void setAdditionalDefence(int additionalDefence) {
        this.additionalDefence = additionalDefence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
