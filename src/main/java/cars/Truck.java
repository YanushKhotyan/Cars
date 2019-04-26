package cars;

import singleton.LazyInitializedSingleton;

public class Truck extends Cars {


    private String weight;
    private String thrust;
    private double payloadCapasity;

    LazyInitializedSingleton lazyInitializedSingleton = new LazyInitializedSingleton();

    public Truck(String model, String complication) {
        super(model, complication);
        this.weight = weight;
        this.thrust = thrust;
        this.payloadCapasity = payloadCapasity;
    }

    public String getThrust() {
        return this.thrust;
    }

    public String getWeight() {
        return this.weight;
    }

    public double getPayloadCapasity() {
        return this.payloadCapasity;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setThrust(String thrust) {
        this.weight = thrust;
    }

    @Override
    public void speed() {
        System.out.println("Truck speed is 90 km/h ");
    }

    @Override
    public void limitFuel() {
        System.out.println("Truck fuel limit is 1000 km/h ");
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight='" + weight + '\'' +
                ", thrust='" + thrust + '\'' +
                ", payloadCapasity=" + payloadCapasity +
                '}';
    }


}
