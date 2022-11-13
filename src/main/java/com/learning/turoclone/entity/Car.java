package com.learning.turoclone.entity;

public class Car {
//    Car table
//    * Car ID
//    * User ID
//    * Model
//    * Make
//    * Year
//    * DESCRIPTION

    private int carId;
    private int userId;
    private String model;
    private String make;
    private String year;
    private String description;

    public Car(int carId, int userId, String model, String make, String year, String description) {
        this.carId = carId;
        this.userId = userId;
        this.model = model;
        this.make = make;
        this.year = year;
        this.description = description;
    }

    public Car() {
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
