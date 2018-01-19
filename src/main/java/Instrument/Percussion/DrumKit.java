package Instrument.Percussion;

import Instrument.Material;

public class DrumKit extends Percussion {

    public DrumKit(Material material, String brand, double unitCost, double salePrice) {
        super(material, brand, unitCost, salePrice);
    }

    @Override
    public String play() {
        return "Lots of noise";
    }
}