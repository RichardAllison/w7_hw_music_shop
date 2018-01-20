package Instrument.Strings;

import Instrument.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;

    @Before
    public void before() {
        violin = new Violin(Material.WOOD, "None", 200.0, 350.50, 4);
    }

    @Test
    public void canPlayViolin() {
        assertEquals("Mendelssohn's Violin Concerto", violin.play());
    }

}
