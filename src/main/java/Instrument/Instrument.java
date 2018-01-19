package Instrument;

import Shop.ISellable;

public abstract class Instrument implements IPlayable, ISellable {

    InstrumentCategory type;
    Material material;
    String brand;
    double unitCost;
    double salePrice;

    public Instrument(InstrumentCategory type, Material material, String brand, double unitCost, double salePrice) {
        this.type = type;
        this.material = material;
        this.brand = brand;
        this.unitCost = unitCost;
        this.salePrice = salePrice;
    }

    public Material getMaterial() {
        return this.material;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getUnitCost() {
        return this.unitCost;
    }
    public double getSalePrice() {
        return salePrice;
    }

    public void setUnitCost(int unitCost) {
        this.unitCost = unitCost;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public double calculateMargin() {
        return this.salePrice - this.unitCost;
    }

    public InstrumentCategory getInstrumentType() {
        return this.type;
    }
}
