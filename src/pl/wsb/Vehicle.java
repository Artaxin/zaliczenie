package pl.wsb;



    public abstract class Vehicle{
        String plates;
        Long vin;
        String color;
        Double price;
        Integer fuelCons;
        Integer tank;
        Long counter;

        public Vehicle(String plates, Long vin, String color, Double price, Integer fuelCons, Integer tank, Long counter) {
            this.plates = plates;
            this.vin = vin;
            this.color = color;
            this.price = price;
            this.fuelCons = fuelCons;
            this.tank = tank;
            this.counter = counter;
        }
    }

