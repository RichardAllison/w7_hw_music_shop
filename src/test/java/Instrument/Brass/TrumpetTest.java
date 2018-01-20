package Instrument.Brass;

import Instrument.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet(Material.BRASS, "None", 350, 450, 3);
    }

    @Test
    public void canPlayTrumpet() {
        assertEquals("Trumpet noises", trumpet.play());
    }

}
