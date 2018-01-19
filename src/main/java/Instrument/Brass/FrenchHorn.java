package Instrument.Brass;

import Instrument.Material;

public class FrenchHorn extends Brass {

    public FrenchHorn(Material material, String brand, double unitCost, double salePrice, int valves) {
        super(material, brand, unitCost, salePrice, valves);
    }

    @Override
    public String play() {
        return "French horn noises";
    }
}
