/*

10 Agustus 2021

10118377
Farhan Rafly Fahrezi Saepulloh
IF - 9

*/

package com.example.tugas_uas_genap_2021_akb_if_9_10118377.model;

public class PlaceModel {

    String img, name, region;

    PlaceModel() {

    }

    public PlaceModel(String img, String name, String region) {
        this.img = img;
        this.name = name;
        this.region = region;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
