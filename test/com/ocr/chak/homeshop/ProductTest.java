package com.ocr.chak.homeshop;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private Customer customer;
    private Map<Product, Integer> products;

    /**
     * Add a product with quantity in the bill
     * @param product product to add
     * @param quantity quantity of the product
     */
    public void addProduct (Product product, Integer quantity) {
        this.products.put(product, quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

}