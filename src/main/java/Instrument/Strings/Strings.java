package Instrument.Strings;

import Instrument.*;

public abstract class Strings extends Instrument {

    private int strings;

    public Strings(Material material, String brand, double unitCost, double salePrice, int strings) {
        super(InstrumentCategory.STRING, material, brand, unitCost, salePrice);
        this.strings = strings;
    }

    public int getStrings() {
        return this.strings;
    }
}
