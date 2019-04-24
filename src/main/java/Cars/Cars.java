package Cars;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties
public abstract class Cars {

    public abstract void speed();

    public abstract void limitFuel();

    private String model;

    private String complication;

    public Cars(String model, String complication) {
        this.model = model;
        this.complication = complication;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getComplication() {
        return complication;
    }

    public void setComplication(String complication) {
        this.complication = complication;
    }
}
