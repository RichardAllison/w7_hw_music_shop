package Instrument.Strings;

import Instrument.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CelloTest {
    Cello cello;

    @Before
    public void before() {
        cello = new Cello(Material.WOOD,"None", 400, 600, 4);
    }

    @Test
    public void canPlayCello() {
        assertEquals("Cello noises", cello.play());
    }
}
