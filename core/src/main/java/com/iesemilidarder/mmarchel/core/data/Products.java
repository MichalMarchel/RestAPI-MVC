package com.iesemilidarder.mmarchel.core.data;

public abstract class Products {

    private String id;
    private String destination;
    private String source;
    private double price;
    private String company;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Products(String id, String destination, String source, double price, String company) {
        this.id = id;
        this.destination = destination;
        this.source = source;
        this.price = price;
        this.company = company;
    }
}
