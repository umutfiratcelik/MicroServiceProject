package com.example.salecatalogueservice.models;

public class Sale {
    private int no;
    private int price;
    private int year;
    private boolean favorite;
    private String Model;

    public Sale(int no, int price, int year, boolean favorite, String model) {
        this.no = no;
        this.price = price;
        this.year = year;
        this.favorite = favorite;
        Model = model;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
