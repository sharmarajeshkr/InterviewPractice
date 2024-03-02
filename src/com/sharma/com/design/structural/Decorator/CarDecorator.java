package com.sharma.designPattern.structural.Decorator;


//
interface Car{
    public void assemble();
}

class BaseCar implements  Car{
    @Override
    public void assemble() {
        System.out.println("Base care Implementation");
    }
}

public class CarDecorator implements Car{
    private Car car;

    CarDecorator(Car c){
        this.car =c;
    }
    @Override
    public void assemble() {
        this.car.assemble();
    }
}

// Extending Base Car Feature to Sports Cars

class SportsCar extends  CarDecorator{

    public SportsCar(Car c) {
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        addedSportCarFaetures();
    }

    private void addedSportCarFaetures(){
        System.out.println("Added new Sports cars Features");

    }
}


class LuxuryCar extends CarDecorator{

    public LuxuryCar(Car c) {
        super(c);
    }


    public void assemble() {
        super.assemble();
        addedLuxuryCarFeatures();
    }

    private void addedLuxuryCarFeatures(){
        System.out.println("Added new Luxury cars Features");

    }


}