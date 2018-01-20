package Instrument;

import Shop.*;

public abstract class Instrument extends Stock implements IPlayable, ISellable {

    private InstrumentCategory type;
    private Material material;
    private String brand;

    public Instrument(InstrumentCategory type, Material material, String brand, double unitCost, double salePrice) {
        super(unitCost, salePrice);
        this.type = type;
        this.material = material;
        this.brand = brand;
    }

    public Material getMaterial() {
        return this.material;
    }

    public String getBrand() {
        return this.brand;
    }

    public InstrumentCategory getInstrumentType() {
        return this.type;
    }
}
