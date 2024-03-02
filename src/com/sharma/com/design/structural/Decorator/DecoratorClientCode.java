package com.sharma.designPattern.structural.Decorator;

/*
        Decorator Design Pattern : Used to add responsibilities dynamically.
        Example :

        Suppose we want to implement different kinds of cars –
        we can create interface Car to define the assemble method and then we can have a Basic car,
        further more we can extend it to Sports car and Luxury Car.

        But if we want to get a car at runtime that has both the features of sports car and luxury car,
        then the implementation gets complex and if further more we want to specify which features should be added first,
        it gets even more complex.

        Now imagine if we have ten different kind of cars,
        the implementation logic using inheritance and composition will be impossible to manage.
        To solve this kind of programming situation, we apply decorator pattern in java.

 */
public class DecoratorClientCode {
    public static void main(String[] args) {
        // Creating Sports car.
        // Base car model + added features on based car with sports Car
        Car sportsCar = new SportsCar( new BaseCar());
        sportsCar.assemble();

        // Creating a car with aports with luxay card features
        Car sportsLuxaryCar = new LuxuryCar( new SportsCar( new BaseCar()));
        sportsLuxaryCar.assemble();


    }
}
