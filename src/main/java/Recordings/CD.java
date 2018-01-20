package Recordings;

import Shop.ISellable;


public class CD implements ISellable {

    private double unitCost;
    private double salePrice;

    public CD(double unitCost, double salePrice) {
        this.unitCost = unitCost;
        this.salePrice = salePrice;
    }

    public double getUnitCost() {
        return this.unitCost;
    }

    public double getSalePrice() {
        return this.salePrice;
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
