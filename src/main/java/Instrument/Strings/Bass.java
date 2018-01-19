package Instrument.Strings;

import Instrument.*;

public class Bass extends Strings {

    public Bass(Material material, String brand, double unitCost, double salePrice, int strings) {
        super(material, brand, unitCost, salePrice, strings);
    }

    @Override
    public String play() {
        return "Bass noises";
    }
}
