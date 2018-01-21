package Recordings;

import Shop.ISellable;

public abstract class Recording implements ISellable {

    private String title;
    private double unitCost;
    private double salePrice;

    public Recording(String title, double unitCost, double salePrice) {
        this.title = title;
        this.unitCost = unitCost;
        this.salePrice = salePrice;
    }

    public String getTitle() {
        return this.title;
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
