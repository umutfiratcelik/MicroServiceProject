package com.example.ratingdataservice.models;

public class Rating {

        private String saleId;
        private int rating;

    public Rating(String saleId, int rating) {
        this.saleId = saleId;
        this.rating = rating;
    }

    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
