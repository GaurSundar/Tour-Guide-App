package com.example.delhitourguide;

public class India {

    private String placename;
    private String nearmetro;
    private int imageid;

    public India(String placename, String nearmetro , int imageid) {
        this.placename = placename;
        this.nearmetro = nearmetro;
        this.imageid = imageid;
    }

    public int getImageid() {
        return imageid;
    }

    public String getNearmetro() {
        return nearmetro;
    }

    public String getPlacename() {
        return placename;
    }
}
