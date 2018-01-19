package Instrument.Strings;

import Instrument.*;

public class Viola extends Strings {

    public Viola(Material material, String brand, double unitCost, double salePrice, int strings) {
        super(material, brand, unitCost, salePrice, strings);
    }

    @Override
    public String play() {
        return "Viola noises";
    }
}
