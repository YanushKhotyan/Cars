package cars;

import singleton.Singleton;

public class Porshe {
    Singleton singleton = new Singleton();

    private String colors;
    private String horsepower;
    private String seconds;


    public Porshe() {
        this.colors = colors;
        this.horsepower = horsepower;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "Porshe{" +
                "colors='" + colors + '\'' +
                ", horsepower='" + horsepower + '\'' +
                ", seconds='" + seconds + '\'' +
                '}';
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(String horsepower) {
        this.horsepower = horsepower;
    }

    public String getSeconds() {
        return seconds;
    }

    public void setSeconds(String seconds) {
        this.seconds = seconds;
    }
}
