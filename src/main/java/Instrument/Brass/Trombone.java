package Instrument.Brass;

import Instrument.Material;

public class Trombone extends Brass {

    public Trombone(Material material, String brand, double unitCost, double salePrice, int valves) {
        super(material, brand, unitCost, salePrice, valves);
    }

    @Override
    public String play() {
        return "Trombone noises";
    }
}
