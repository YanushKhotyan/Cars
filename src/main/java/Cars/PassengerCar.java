package Cars;

public class PassengerCar extends Cars{

    private String nameOfTuningStudio;
    private boolean automaticTransmission;
    private String lowCost;
    private String maxSpeed;



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

    public PassengerCar(String model, String complication, String nameOfTuningStudio, boolean automaticTransmission) {
        super(model, complication);
        this.nameOfTuningStudio = nameOfTuningStudio;
        this.automaticTransmission = automaticTransmission;
    }

    public String getNameOfTuningStudio() {
        return nameOfTuningStudio;
    }

    public void setNameOfTuningStudio(String nameOfTuningStudio) {
        this.nameOfTuningStudio = nameOfTuningStudio;
    }

    public boolean isAutomaticTransmission() {
        return automaticTransmission;
    }

    public void setAutomaticTransmission(boolean automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
    }
}
