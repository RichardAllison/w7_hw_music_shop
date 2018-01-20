package Instrument.Keyboard;

import Instrument.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(Material.WOOD,"Bösendorfer", 8000, 10000, 88);
    }

    @Test
    public void canPlayPiano() {
        assertEquals("Beethoven's Moonlight Sonata", piano.play());
    }
}
