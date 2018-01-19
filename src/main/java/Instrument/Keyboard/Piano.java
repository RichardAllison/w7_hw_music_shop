package Instrument.Keyboard;

import Instrument.*;

public class Piano extends Keyboard {

    public Piano(Material material, String brand, double unitCost, double salePrice, int keys) {
        super(material, brand, unitCost, salePrice, keys);
    }

    @Override
    public String play() {
        return "Beethoven's Moonlight Sonata";
    }
}
