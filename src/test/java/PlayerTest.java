import Fighters.Knight;
import Inventory.Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Knight player;
    private Sword weapon;

    @Before
    public void setUp(){
        weapon = new Sword("SwordOfFreedom", 30);
        player = new Knight("NoelTheKing", 300, 2000, 300);

    }

    @Test
    public void canGetName(){
        assertEquals("NoelTheKing", player.getName());
    }

    @Test
    public void canGetHealthPoints(){ assertEquals(300, player.getHealthPoints());}

    @Test
    public void canGetWallet(){
        assertEquals(2000, player.getWallet());
    }

    @Test
    public void hasDefence(){
        assertEquals(300, player.getDefence());  
    }

    @Test
    public void hasWeapon(){
        assertEquals("SwordOfFreedom", weapon.getName());
    }

    @Test
    public void canGetDamage(){
        assertEquals(30, weapon.getDamage());
    }
}
