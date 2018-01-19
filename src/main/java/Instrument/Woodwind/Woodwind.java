package Instrument.Woodwind;

import Instrument.*;

public abstract class Woodwind extends Instrument {

    public Woodwind(Material material, String brand, double unitCost, double salePrice, int reeds) {
        super(material, brand, unitCost, salePrice);
    }

}
