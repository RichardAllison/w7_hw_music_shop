package Instrument.Strings;

import Instrument.*;

public class Violin extends Strings {

    public Violin(Material material, String brand, double unitCost, double salePrice, int strings) {
        super(material, brand, unitCost, salePrice, strings);
    }

    @Override
    public String play() {
        return "Mendelssohn's Violin Concerto";
    }
}
