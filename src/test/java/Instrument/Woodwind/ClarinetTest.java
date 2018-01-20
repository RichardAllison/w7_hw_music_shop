package Instrument.Woodwind;

import Instrument.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    Clarinet clarinet;

    @Before
    public void before() {
        clarinet = new Clarinet(Material.WOOD, "None", 400, 550, 1);
    }

    @Test
    public void canPlayClarinet() {
        assertEquals("Clarinet noises", clarinet.play());
    }
}
