package Instrument.Woodwind;
import Instrument.*;
public class Bassoon extends Woodwind {

    public Bassoon(Material material, String brand, double unitCost, double salePrice, int reeds) {
        super(material, brand, unitCost, salePrice, reeds);
    }

    @Override
    public String play() {
        return "Bassoon noises";
    }
}