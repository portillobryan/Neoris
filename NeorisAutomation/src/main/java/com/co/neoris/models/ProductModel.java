package com.co.neoris.models;

public class ProductModel {
    private String product;
    private String product2;
    private String firstname;
    private String lastname;
    private String zipcode;

    public ProductModel(String product, String product2, String firstname, String lastname, String zipcode) {
        this.product = product;
        this.product2 = product2;
        this.firstname = firstname;
        this.lastname = lastname;
        this.zipcode = zipcode;
    }

    public String getProduct() {
        return product;
    }

    public String getProduct2() {
        return product2;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getZipcode() {
        return zipcode;
    }
}
