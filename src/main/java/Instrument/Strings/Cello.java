package Instrument.Strings;

import Instrument.*;

public class Cello extends Strings {

    public Cello(Material material, String brand, double unitCost, double salePrice, int strings) {
        super(material, brand, unitCost, salePrice, strings);
    }

    @Override
    public String play() {
        return "Cello noises";
    }
}
