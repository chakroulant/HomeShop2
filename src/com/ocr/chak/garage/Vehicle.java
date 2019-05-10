package com.ocr.chak.garage;

public class Vehicle {
    private String description;
    private String manufacturer;
    private int speed;
    private int year;
    private String modelName;
    private String color;
    private int[] dimensions = new int[3];
    private int weight;


    public Vehicle(String modelName, String description, String manufacturer, int year, String color, int speed, int[] dimesions, int weight) {
        this.modelName = modelName;
        this.description = description;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.speed = speed;
        this.dimension = dimesion;
        this.weight = weight;
    }


    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    public int[] getDimension() {
        return dimension;
    }

    public int getWeight() {
        return weight;
    }
}
