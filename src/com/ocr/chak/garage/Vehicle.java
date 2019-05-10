package com.ocr.chak.garage;

public abstract class Vehicle {
    private String description;
    private String manufacturer;
    private int speed;
    private int year;
    protected String modelName;
    private String color;
    private int[] dimensions = new int[3];
    private int weight;


    public Vehicle(String modelName, String description, String manufacturer, int year, String color, int speed, int[] dimensions, int weight) {
        this.modelName = modelName;
        this.description = description;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.speed = speed;
        this.dimensions = dimensions;
        this.weight = weight;
    }

    public abstract void start();

    public abstract void stop();

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
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }
}
