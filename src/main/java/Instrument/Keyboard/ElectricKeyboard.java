package Instrument.Keyboard;

import Instrument.Material;

public class ElectricKeyboard extends Keyboard {

    int voices;

    public ElectricKeyboard(Material material, String brand, double unitCost, double salePrice, int keys, int voices) {
        super(material, brand, unitCost, salePrice, keys);
        this.voices = voices;
    }

    @Override
    public String play() {
        return "Different noises";
    }

    public int getVoices() {
        return this.voices;
    }
}
