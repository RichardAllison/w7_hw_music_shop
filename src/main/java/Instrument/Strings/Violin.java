package Instrument.Strings;

import Instrument.*;

public class Violin extends Strings {

    public Violin(Material material, String brand, double unitCost, double salePrice) {
        super(material, brand, unitCost, salePrice, 4);
    }

    @Override
    public String play() {
        return "Mendelssohn's Violin Concerto";
    }
}
