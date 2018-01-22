package Recordings;

import java.util.ArrayList;

public class BoxSet extends Recording {


    private ArrayList<Recording> contents;

    public BoxSet(String title, ArrayList<Recording> contents, double unitCost, double salePrice) {
        super(title, unitCost, salePrice);
        this.contents = contents;
    }

    public int contentsCount() {
        return this.contents.size();
    }

    public ArrayList<Recording> getContents() {
        return this.contents;
    }
}
