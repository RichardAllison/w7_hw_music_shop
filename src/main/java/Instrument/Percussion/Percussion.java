package Instrument.Percussion;

import Instrument.*;

public abstract class Percussion extends Instrument {

    public Percussion(Material material, String brand, double unitCost, double salePrice) {
        super(InstrumentCategory.PERCUSSION, material, brand, unitCost, salePrice);
    }

}
