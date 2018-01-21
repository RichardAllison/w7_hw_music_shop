package InstrumentAccessories;

import Instrument.Strings.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentAccessoryTest {

    InstrumentAccessory instrumentCase;

    @Before
    public void before() {
        instrumentCase = new InstrumentCase<Violin>("Violin case", 40, 60);
    }

    @Test
    public void hasDescription() {
        assertEquals("Violin case", instrumentCase.getDescription());
    }

    @Test
    public void hasUnitCost() {
        assertEquals(40, instrumentCase.getUnitCost(), 0);
    }

    @Test
    public void hasSalePrice() {
        assertEquals(60,instrumentCase.getSalePrice(), 0);
    }

}
