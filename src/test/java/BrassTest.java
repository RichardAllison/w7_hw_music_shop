import Instrument.*;
import Instrument.Brass.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrassTest {

    FrenchHorn frenchHorn;
    Trombone trombone;
    Trumpet trumpet;
    Tuba tuba;

    @Before
    public void before() {
        trumpet = new Trumpet(Material.BRASS, "None", 350, 450, 3);
        frenchHorn = new FrenchHorn(Material.BRASS, "None",400,600, 3);
        trombone = new Trombone(Material.BRASS, "None",300, 500, 0);
        tuba = new Tuba(Material.BRASS, "None", 600, 800, 4);
    }

    @Test
    public void tromboneHasMaterial() {
        assertEquals(Material.BRASS, trombone.getMaterial());
    }

    @Test
    public void trumpetHasValves() {
        assertEquals(3, trumpet.getValves());
    }

    @Test
    public void canPlayTrumpet() {
        assertEquals("Trumpet noises", trumpet.play());
    }

    @Test
    public void canPlayFrenchHorn() {
        assertEquals("French horn noises", frenchHorn.play());
    }

    @Test
    public void canPlayTrombone() {
        assertEquals("Trombone noises", trombone.play());
    }


    @Test
    public void canPlayTuba() {
        assertEquals("Tuba noises", tuba.play());
    }
}
