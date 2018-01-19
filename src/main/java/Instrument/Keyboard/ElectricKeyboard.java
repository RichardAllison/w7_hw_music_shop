package Instrument.Keyboard;

import Instrument.Material;

public class ElectricKeyboard extends Keyboard {

    public ElectricKeyboard(Material material, String brand, double unitCost, double salePrice, int keys) {
        super(material, brand, unitCost, salePrice, keys);
    }

    @Override
    public String play() {
        return "Different noises";
    }
}
