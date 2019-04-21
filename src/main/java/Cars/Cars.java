package Cars;

public abstract class Cars {

    private String color;

    private Boolean autoTransmission;

    private int maxSeats;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cars cars = (Cars) o;

        return maxSeats == cars.maxSeats;
    }

    @Override
    public int hashCode() {
        return maxSeats;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getAutoTransmission() {
        return autoTransmission;
    }

    public void setAutoTransmission(Boolean autoTransmission) {
        this.autoTransmission = autoTransmission;
    }

    public Cars(String color, Boolean autoTransmission, int maxSeats) {
        this.color = color;
        this.autoTransmission = autoTransmission;

    }

    public abstract void transportation();


    @Override
    public String toString() {
        return "Cars{" +
                "color='" + color + '\'' +
                ", autoTransmission=" + autoTransmission +
                '}';
    }
}
