package Player;

import Inventory.Weapons.Weapon;

public abstract class Player {

    private String name;
    private int healthPoints;
    private int wallet;

    public Player(String name, int healthPoints, int wallet){
        this.healthPoints = healthPoints;
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public void changeWeapon(Weapon weapon){

    }

    public void addTreasureToWallet(int value) {
        this.wallet += value;
    }
}
