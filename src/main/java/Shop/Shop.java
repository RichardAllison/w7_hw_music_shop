package Shop;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISellable> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISellable> getStock() {
        return this.stock;
    }

    public void addToStock(ISellable item) {
        this.stock.add(item);
    }

    public void removeFromStock(ISellable item) {
        this.stock.remove(item);
    }

    public int getStockCount() {
        return stock.size();
    }

    public double calculateTotalMargin() {
        double totalMargin = 0;
        for(int i = 0; i < getStockCount(); i++){
            totalMargin += stock.get(i).calculateMargin();
        }
        return totalMargin;
    }
}
