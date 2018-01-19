package Shop;

import java.util.ArrayList;

public class Shop {

    ArrayList<ISellable> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public void addToStock(ISellable item) {
        this.stock.add(item);
    }

    public void removeFromStock(ISellable item) {
        this.stock.remove(item);
    }

}
