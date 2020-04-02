import Fighters.Knight;
import Inventory.Weapons.Sword;
import Inventory.Weapons.Weapon;
import org.junit.Before;

public class KnightTest {

    private Knight knight;
    private Sword sword;

    @Before
    public void setUp(){
        Sword sword = new Sword();
    knight = new Knight("Blackbird", sword, 200, 20, 20);
    }
}
