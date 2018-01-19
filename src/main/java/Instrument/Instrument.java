package Instrument;

public abstract class Instrument {

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
        return material;
    }

    public String getBrand() {
        return brand;
    }

    public double getUnitCost() {
        return unitCost;
    }
}
