package Instrument.Percussion;

import Instrument.Material;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PercussionTest {

    Percussion drums;

    @Before
    public void before() {
        drums = new DrumKit(Material.PLASTIC, "Yamaha", 120, 150, 5);
    }

    @Test
    public void drumKitHasMaterial() {
        assertEquals(Material.PLASTIC, drums.getMaterial());
    }

}
