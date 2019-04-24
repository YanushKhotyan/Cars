package cars;

public class PassengerCar extends Cars{

    private String nameOfTuningStudio;
    private String automaticTransmission;
    private String lowCost;
    private String maxSpeed;


    @Override
    public String toString() {
        return "PassengerCar{" +
                "nameOfTuningStudio='" + nameOfTuningStudio + '\'' +
                ", automaticTransmission='" + automaticTransmission + '\'' +
                ", lowCost='" + lowCost + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                '}';
    }

    public PassengerCar(String model, String complication) {
        super(model, complication);
    }

    public String getLowCost() {
        return lowCost;
    }

    public void setLowCost(String lowCost) {
        this.lowCost = lowCost;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
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
        return nameOfTuningStudio;
    }

    public void setNameOfTuningStudio(String nameOfTuningStudio) {
        this.nameOfTuningStudio = nameOfTuningStudio;
    }

    public String getAutomaticTransmission() {
        return automaticTransmission;
    }

    public void setAutomaticTransmission(String automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
    }
}
