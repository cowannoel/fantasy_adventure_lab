package Fighters;

import Inventory.Weapons.Weapon;
import Rooms.Monster.Monster;

public abstract class Fighter {

    private String name;
    private Weapon weapon;
    private int defence;

    public Fighter(String name, Weapon weapon, int defence) {
        this.name = name;
        this.weapon = weapon;
        this.defence = defence;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public abstract void attack(Monster monster, Weapon weapon);


}
