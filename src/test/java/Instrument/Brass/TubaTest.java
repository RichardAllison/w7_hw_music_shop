package Instrument.Brass;

import Instrument.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TubaTest {

    Tuba tuba;

    @Before
    public void before() {
        tuba = new Tuba(Material.BRASS, "None", 600, 800, 4);
    }

    @Test
    public void canPlayTuba() {
        assertEquals("Tuba noises", tuba.play());
    }

}

