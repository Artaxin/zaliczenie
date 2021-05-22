package pl.wsb;

public class Car extends Vehicle implements Activities{

    public Car(String plates, Long vin, String color, Double price, Integer fuelCons, Integer tank, Long counter) {
    super(plates, vin, color, price, fuelCons, tank, counter);
    }

    @Override
    public void drive() {

    }

    @Override
    public void refuel() {

    }

    @Override
    public void distance() {

    }
}
