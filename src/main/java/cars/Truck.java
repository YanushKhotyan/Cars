package cars;

public class Truck extends Cars {


    private String weight;
    private String thrust;

    public String getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight='" + weight + '\'' +
                ", thrust='" + thrust + '\'' +
                ", payloadCapasity=" + payloadCapasity +
                '}';
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getThrust() {
        return thrust;
    }

    public void setThrust(String thrust) {
        this.thrust = thrust;
    }

    public Truck(String model, String complication, String weight, String thrust) {
        super(model, complication);
        this.weight = weight;
        this.thrust = thrust;
    }

    private double payloadCapasity;

    @Override
    public void speed() {
        System.out.println("Truck speed is 90 km/h ");
    }

    @Override
    public void limitFuel() {
        System.out.println("Truck fuel limit is 1000 km/h ");
    }

    public Truck(String model, String complication) {
        super(model, complication);
        this.payloadCapasity = payloadCapasity;
    }

    public double getPayloadCapasity() {
        return payloadCapasity;
    }

    public void setPayloadCapasity(double payloadCapasity) {
        this.payloadCapasity = payloadCapasity;
    }
}
