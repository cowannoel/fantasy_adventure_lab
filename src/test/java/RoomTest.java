import Fighters.Knight;
import Fighters.Knight;
import Inventory.Weapons.Sword;
import Rooms.Monster.Orc;
import Rooms.Monster.Orc;
import Rooms.Room;
import Rooms.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room;
    private Knight player;
    private Orc orc;
    private Treasure treasureChest;
    private Sword weapon;

    @Before
    public void setUp(){
        orc = new Orc("Ugly Orc", 200, 100);
        treasureChest = new Treasure("treasureChest", 20000);
        room = new Room("DarkRoom1", treasureChest, orc);
        weapon = new Sword("SwordOfFreedom", 90);
        player = new Knight("NoelTheKing", 300, 2000, 300);
    }

    @Test
    public void canDefeatMonster(){
        player.attack(orc, weapon);
        player.attack(orc, weapon);
        player.attack(orc, weapon);
        assertEquals(0, orc.getHealthPoints());
    }

    @Test
    public void canGetTreasureWhenMonsterDead(){
        player.addTreasureToWallet(treasureChest.getValue());
        assertEquals(22000, player.getWallet());
    }



}
