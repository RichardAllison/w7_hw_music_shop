package Instrument.Woodwind;

import Instrument.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before() {
        saxophone = new Saxophone(Material.BRASS, "None", 100.0, 300.0, 1);
    }

    @Test
    public void canPlaySaxophone() {
        assertEquals("Saxophone noises", saxophone.play());
    }

}
