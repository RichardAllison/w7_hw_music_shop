package InstrumentAccessories;

import Shop.ISellable;

public abstract class InstrumentAccessory implements ISellable {

    private String description;
    private double unitCost;
    private double salePrice;

    public InstrumentAccessory(String description, double unitCost, double salePrice) {
        this.description = description;
        this.unitCost = unitCost;
        this.salePrice = salePrice;
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

    public String getDescription() {
        return this.description;
    }
}
