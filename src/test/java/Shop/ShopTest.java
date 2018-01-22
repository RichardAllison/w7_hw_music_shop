package Shop;

import Instrument.*;
import Instrument.Keyboard.Piano;
import Instrument.Strings.Violin;
import InstrumentAccessories.InstrumentCase;
import Recordings.CD;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Violin violin;
    Piano piano;
    InstrumentCase<Violin> instrumentCase;
    CD cd;

    @Before
    public void before() {
        shop = new Shop();
        violin = new Violin(Material.WOOD, "None", 200.0, 350.50, 4);
        piano = new Piano(Material.WOOD,"Bösendorfer", 8000, 10000, 88);
        instrumentCase = new InstrumentCase<>("Violin case", 40, 60);
        cd = new CD("Title", "Artist", 12, 5, 10);
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(violin);
        assertEquals(1, shop.getStockCount());
        assertEquals(violin, shop.getStock().get(0));
    }

    @Test
    public void canAddDifferentSellableTypesToStock() {
        shop.addToStock(violin);
        shop.addToStock(instrumentCase);
        shop.addToStock(cd);
        assertEquals(3, shop.getStockCount());
        assertEquals(instrumentCase, shop.getStock().get(1));
    }

    @Test
    public void canRemoveFromStock() {
        shop.addToStock(violin);
        shop.removeFromStock(violin);
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canCalculateTotalMargin() {
        shop.addToStock(violin);
        shop.addToStock(piano);
        assertEquals(2, shop.getStockCount());
        assertEquals(2150.5, shop.calculateTotalMargin(), 0.0);
    }
}
