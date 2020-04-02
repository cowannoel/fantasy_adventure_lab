package Rooms.Monster;

public abstract class Monster {

    private String name;
    private int defence;
    private int healthPoints;

    public Monster(String name, int defence, int healthPoints){
        this.name = name;
        this.defence = defence;
        this.healthPoints = healthPoints;

    }
    public void reduceHealthPoints(int attack){
        this.healthPoints -= attack;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
