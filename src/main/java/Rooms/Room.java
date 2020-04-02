package Rooms;

import Rooms.Monster.Monster;

public class Room {
    private String name;
    private Treasure treasure;
    private Monster monster;

    public Room(String name, Treasure treasure, Monster monster){
        this.name = name;
        this.treasure = treasure;
        this.monster = monster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public void setTreasure(Treasure treasure) {
        this.treasure = treasure;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }
}
