package com.example.saleinfoservice.models;

public class Sale {
    private String saleId;
    private String name;

    public Sale(String saleId, String name) {
        this.saleId = saleId;
        this.name = name;
    }

    public String getSaleId() {
        return saleId;
    }

    public void setSaleId(String saleId) {
        this.saleId = saleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
