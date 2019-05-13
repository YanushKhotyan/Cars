package cars;

import singleton.LazyInitializedSingleton;

public class Porshe {
    LazyInitializedSingleton lazyInitializedSingleton = new LazyInitializedSingleton();

    private String Color;
    private String SecondTo100km;
    private String Horsepower;


    public Porshe(String color, String seconTo100km, String horsepower) {
        Color = color;
        SecondTo100km = seconTo100km;
        Horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "Porshe{" +
                "Color='" + Color + '\'' +
                ", SeconTo100km='" + SecondTo100km + '\'' +
                ", Horsepower='" + Horsepower + '\'' +
                '}';
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getSeconTo100km() {
        return SecondTo100km;
    }

    public void setSeconTo100km(String seconTo100km) {
        SecondTo100km = seconTo100km;
    }

    public String getHorsepower() {
        return Horsepower;
    }

    public void setHorsepower(String horsepower) {
        Horsepower = horsepower;
    }
}
