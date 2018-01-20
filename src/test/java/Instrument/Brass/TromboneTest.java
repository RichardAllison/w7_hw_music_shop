package Instrument.Brass;

import Instrument.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTest {

    Trombone trombone;

    @Before
    public void before() {
        trombone = new Trombone(Material.BRASS, "None",300, 500, 0);
    }

    @Test
    public void canPlayTrombone() {
        assertEquals("Trombone noises", trombone.play());
    }
}
