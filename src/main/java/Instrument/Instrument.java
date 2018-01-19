package Instrument;

import Shop.ISellable;

public abstract class Instrument implements IPlayable, ISellable {

    Material material;
    String brand;
    double unitCost;
    double salePrice;

    public Instrument(Material material, String brand, double unitCost, double salePrice) {
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
}
