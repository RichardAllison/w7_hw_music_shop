package SheetMusic;

import Shop.ISellable;

public class SheetMusic implements ISellable {
    private String name;
    private String composer;
    private String publisher;
    private int pages;
    private double unitCost;
    private double salePrice;

    public SheetMusic(String name, String composer, String publisher, int pages, double unitCost, double salePrice) {
        this.name = name;
        this.composer = composer;
        this.publisher = publisher;
        this.pages = pages;
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

    public String getName() {
        return this.name;
    }

    public String getComposer() {
        return this.composer;
    }
}
