package Instrument.Brass;

import Instrument.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrassTest {

    Brass trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet(Material.BRASS, "None", 350, 450, 3);
    }

    @Test
    public void trumpetHasMaterial() {
        assertEquals(Material.BRASS, trumpet.getMaterial());
    }

    @Test
    public void trumpetHasValves() {
        assertEquals(3, trumpet.getValves());
    }

}
