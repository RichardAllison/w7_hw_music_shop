import Instrument.*;
import Instrument.Percussion.DrumKit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PercussionTest {
    DrumKit drums;

    @Before
    public void before() {
        drums = new DrumKit(Material.PLASTIC, "Yamaha", 120, 150, 5);
    }

    @Test
    public void canPlayDrums() {
        assertEquals("Lots of noise", drums.play());
    }
}
