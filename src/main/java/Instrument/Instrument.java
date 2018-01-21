package Instrument;

import Shop.*;

public abstract class Instrument implements IPlayable, ISellable {

    private double unitCost;
    private double salePrice;
    private InstrumentCategory type;
    private Material material;
    private String brand;

    public Instrument(InstrumentCategory type, Material material, String brand, double unitCost, double salePrice) {
        this.unitCost = unitCost;
        this.salePrice = salePrice;
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
}



