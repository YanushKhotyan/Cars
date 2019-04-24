package Cars;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Bus extends Cars {

    private int seatingCapacity;
    private double topSpeed;
    private String color;
    private String name;

    public Bus(String model, String complication)
    {
        super(model, complication);
    }

    public Bus(String model, String complication, int seatingCapacity, double topSpeed, String color, String name) {
        super(model, complication);
        this.seatingCapacity = seatingCapacity;
        this.topSpeed = topSpeed;
        this.color = color;
        this.name = name;
    }

    public Bus(String model, String complication, String color, String name) {
        super(model, complication);
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

    @Override
    public void speed() {
        System.out.println("Bus speed is 100 km/h ");
    }

    @Override
    public void limitFuel() {
        System.out.println("Bus fuel limit is 500 km/h ");
    }

    public Bus(String model, String complication, int seatingCapacity, double topSpeed) {
        super(model, complication);
        this.seatingCapacity = seatingCapacity;
        this.topSpeed = topSpeed;
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
}
