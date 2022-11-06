# car-bnb
Vehicle renting app

Car Sharing Application - “Turo Clone”

* User table
    * Can rent a car
    * Can list their vehicle for rent
    * Search for cars to rent
    * Can delete their car
    * User id
    * Car id
    * First name
    * Last name
    * Driver License #
* Reservation table
    * Reservation id - primary key
    * Payment id
    * Car id
    * User id
    * reserved from Date
    * Reserved to Date
* Payment table
    * Payment ID
    * User ID
    * Car ID
    * Reservation ID
    * Amount
    * Payment Date
* Car table
    * Car ID
    * User ID
    * Model
    * Make
    * Year
    * DESCRIPTION


Your team has been tasked to develop a REST web service to do the following:

A user should have the ability to list a car

A user should have the ability to delete a listed car

A user should have the ability to search cars for rent
1.filter cars

A user should be able to retrieve a car by it’s car ID??

A user should have the ability to reserve a car

A user should have the ability to see reservations


Questions
1. How to differ users:
    1. Customer who wants to rent a car
    2. Customer who wants to lis their car for rent
2. What type of security to use for authentication and autherization
    1. Jwt
    2. oath2
