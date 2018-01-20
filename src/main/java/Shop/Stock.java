package Shop;

public abstract class Stock implements ISellable {

    private double unitCost;
    private double salePrice;


    public Stock(double unitCost, double salePrice) {
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
}
