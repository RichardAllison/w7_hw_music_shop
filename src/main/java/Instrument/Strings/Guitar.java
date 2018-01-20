package Instrument.Strings;

import Instrument.*;

public class Guitar extends Strings {

    InstrumentKind instrumentKind;

    public Guitar(InstrumentKind instrumentKind, Material material, String brand, double unitCost, double salePrice, int strings) {
        super(material, brand, unitCost, salePrice, strings);
        this.instrumentKind = instrumentKind;
    }

    @Override
    public String play() {
        return "Albeniz' Asturias";
    }

    public InstrumentKind getKind() {
        return this.instrumentKind;
    }
}
