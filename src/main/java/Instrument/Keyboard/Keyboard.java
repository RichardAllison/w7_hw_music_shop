package Instrument.Keyboard;

import Instrument.*;

public abstract class Keyboard extends Instrument {

    int keys;

    public Keyboard(Material material, String brand, double unitCost, double salePrice, int keys) {
        super(InstrumentCategory.KEYBOARD, material, brand, unitCost, salePrice);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }
}
