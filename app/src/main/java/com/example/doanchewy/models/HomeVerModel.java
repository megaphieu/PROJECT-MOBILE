package com.example.doanchewy.models;

public class HomeVerModel {
    int  iamge;
    String name;
    String timing;
    String rating;
    String price;

    public HomeVerModel(int iamge, String name, String timing, String rating, String price) {
        this.iamge = iamge;
        this.name = name;
        this.timing = timing;
        this.rating = rating;
        this.price = price;
    }

    public int getIamge() {
        return iamge;
    }

    public void setIamge(int iamge) {
        this.iamge = iamge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
