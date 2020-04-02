package Fighters;

import Inventory.Weapons.Weapon;
import Player.Player;
import Rooms.Monster.Monster;

public abstract class Fighter extends Player {

    private int defence;

    public Fighter(String name, int healthPoints, int wallet, int defence) {
        super(name, healthPoints, wallet);
        this.defence = defence;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public abstract void attack(Monster monster, Weapon weapon);


}
