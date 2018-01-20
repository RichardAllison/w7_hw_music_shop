package Shop;

public interface ISellable {

    double getUnitCost();
    double getSalePrice();
    void setUnitCost(int unitCost);
    void setSalePrice(int salePrice);
    double calculateMargin();

}
