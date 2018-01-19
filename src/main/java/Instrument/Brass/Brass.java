package Instrument.Brass;

import Instrument.*;

public abstract class Brass extends Instrument {

    int valves;

    public Brass(Material material, String brand, double unitCost, double salePrice, int valves) {
        super(material, brand, unitCost, salePrice);
        this.valves = valves;
    }

}
