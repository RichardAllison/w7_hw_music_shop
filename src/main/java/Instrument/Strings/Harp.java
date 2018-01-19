package Instrument.Strings;

import Instrument.*;

public class Harp extends Strings {

    public Harp(Material material, String brand, double unitCost, double salePrice, int strings) {
        super(material, brand, unitCost, salePrice, strings);
    }

    @Override
    public String play() {
        return "Harp noises";
    }
}
