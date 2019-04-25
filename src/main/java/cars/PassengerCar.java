package cars;

public class PassengerCar extends Cars{

    private String nameOfTuningStudio;
    private String automaticTransmission;
    private String lowCost;
    private String maxSpeed;

    public PassengerCar(String model, String complication, String nameOfTuningStudio, String automaticTransmission, String lowCost, String maxSpeed) {
        super(model, complication);
        this.nameOfTuningStudio = nameOfTuningStudio;
        this.automaticTransmission = automaticTransmission;
        this.lowCost = lowCost;
        this.maxSpeed = maxSpeed;
    }

    public PassengerCar(String model, String complication) {
        super(model, complication);
    }

    public String getLowCost() {
        return this.lowCost;
    }

    public String getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public void speed() {
        System.out.println("Bus speed is 250 km/h ");
    }

    @Override
    public void limitFuel() {
        System.out.println("Bus fuel limit is 600 km/h ");
    }

    public String getNameOfTuningStudio() {
        return this.nameOfTuningStudio;
    }

    public String getAutomaticTransmission() {
        return this.automaticTransmission;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "nameOfTuningStudio='" + nameOfTuningStudio + '\'' +
                ", automaticTransmission='" + automaticTransmission + '\'' +
                ", lowCost='" + lowCost + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                '}';
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setLowCost(String lowCost) {
        this.nameOfTuningStudio = lowCost;
    }
}
