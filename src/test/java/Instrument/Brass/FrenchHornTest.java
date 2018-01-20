package Instrument.Brass;

import Instrument.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrenchHornTest {

    FrenchHorn frenchHorn;

    @Before
    public void before() {
        frenchHorn = new FrenchHorn(Material.BRASS, "None",400,600, 3);
    }

    @Test
    public void canPlayFrenchHorn() {
        assertEquals("French horn noises", frenchHorn.play());
    }
}
