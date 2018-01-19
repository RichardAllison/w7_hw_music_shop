package Instrument.Woodwind;
import Instrument.*;
public class Saxophone extends Woodwind {

    public Saxophone(Material material, String brand, double unitCost, double salePrice, int reeds) {
        super(material, brand, unitCost, salePrice, reeds);
    }

    @Override
    public String play() {
        return "Saxophone noises";
    }
}
