package com.ocr.chak.homeshop;

import java.util.Map;

import java.util.HashMap;

public class Bill {
    private Customer customer;
    private Map<Product, Integer> products = new HashMap<Product, Integer>();
    private Delivery delivery;

    public Bill(Customer customer, Delivery delivery) {
        this.customer = customer;
        this.delivery = delivery;
    }

    public void addProduct(Product product, int quantity) {
        this.products.put(product, quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void generate(Writer writer) {

    }

    public double getTotal() {
        return 0;
    }
}