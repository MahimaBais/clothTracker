package com.brevitaz;

public class ClothMaker {

    private String name;
    private ClothDetail clothDetail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClothDetail clothsDetail(){

        clothDetail.setBrandName("POLO");
        clothDetail.setColour("Blue");
        clothDetail.setMaterial("Cotton");
        clothDetail.setName("Tshirt");
        clothDetail.setSize("L");
        clothDetail.setStyle("V-neck");
        clothDetail.setPrice("500");

        return clothDetail;

    }



}
