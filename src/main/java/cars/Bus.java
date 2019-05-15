package cars;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import singleton.Singleton;

@JsonIgnoreProperties
public class Bus extends Cars {

    private int seatingCapacity;
    private double topSpeed;
    private String color;
    private String name;

    Singleton singleton = new Singleton();
    Singleton bus = new Singleton();

    public Bus(String model, String complication) {
        super(model, complication);
        this.seatingCapacity = seatingCapacity;
        this.topSpeed = topSpeed;
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public void speed() {
        System.out.println("Bus speed is 100 km/h ");
    }

    @Override
    public void limitFuel() {
        System.out.println("Bus fuel limit is 500 km/h ");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "seatingCapacity=" + seatingCapacity +
                ", topSpeed=" + topSpeed +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}
