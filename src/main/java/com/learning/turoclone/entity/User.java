package com.learning.turoclone.entity;

public class User {

//    User id
//    * Car id
//    * First name
//    * Last name
//    * Driver License #

    private int userId;
    private int carId;
    private String firstName;
    private String lastName;

    public User(int userId, int carId, String firstName, String lastName) {
        this.userId = userId;
        this.carId = carId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
