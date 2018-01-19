package Instrument.Woodwind;
import Instrument.*;
public class Basoon extends Woodwind {

    public Basoon(Material material, String brand, double unitCost, double salePrice, int reeds) {
        super(material, brand, unitCost, salePrice, reeds);
    }

    @Override
    public String play() {
        return "Basoon noises";
    }
}