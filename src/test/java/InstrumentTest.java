import Instrument.*;
import Instrument.Strings.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Instrument violin;

    @Before
    public void before() {
        violin = new Violin(Material.WOOD, "None", 200.0, 350.50);
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.WOOD, violin.getMaterial());
    }

    @Test
    public void hasBrand() {
        assertEquals("None", violin.getBrand());
    }

    @Test
    public void hasUnitCost() {
        assertEquals(200, violin.getUnitCost(), 0.00);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(200, violin.getUnitCost(), 0.00);
    }

}
