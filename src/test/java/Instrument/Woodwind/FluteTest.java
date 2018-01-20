package Instrument.Woodwind;

import Instrument.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void before() {
        flute = new Flute(Material.METAL, "None",50, 100, 0);
    }

    @Test
    public void canPlayFlute() {
        assertEquals("Flute noises", flute.play());
    }

}
