package Instrument.Percussion;

import Instrument.Material;

public class DrumKit extends Percussion {

    int parts;

    public DrumKit(Material material, String brand, double unitCost, double salePrice, int parts) {
        super(material, brand, unitCost, salePrice);
        this.parts = parts;
    }

    @Override
    public String play() {
        return "Lots of noise";
    }
}