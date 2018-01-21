package Recordings;

import java.util.ArrayList;

public class BoxSet<T extends Recording> extends Recording {


    private ArrayList<T> contents;

    public BoxSet(String title, ArrayList<T> contents, double unitCost, double salePrice) {
        super(title, unitCost, salePrice);
        this.contents = contents;
    }

    public int contentsCount() {
        return this.contents.size();
    }

    public ArrayList<T> getContents() {
        return this.contents;
    }
}
