package pl.wsb;

public class Truck extends Vehicle implements Activities{

    public Truck(String plates, Long vin, String color, Double price, Integer fuelCons, Integer tank, Long counter) {
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
