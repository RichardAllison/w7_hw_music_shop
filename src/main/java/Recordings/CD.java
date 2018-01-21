package Recordings;

import Shop.ISellable;


public class CD extends Recording {

    private String artist;
    private int tracks;

    public CD(String title, String artist, int tracks, double unitCost, double salePrice) {
        super(title, unitCost, salePrice);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return this.artist;
    }

    public int getTracks() {
        return this.tracks;
    }
}
