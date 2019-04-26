package cars;

import singleton.LazyInitializedSingleton;

public class Mercedes extends Cars{

    LazyInitializedSingleton lazyInitializedSingleton = new LazyInitializedSingleton();

    private String colorWhite;
    private String colorBlack;
    private String colorCustom;
    private String modelE211;
    private String modelE212;
    private String modelE213;
    private String fourSecondTo100KmH;
    private String sevenSecondTo100KmH;
    private String twelveSecondTo100KmH;
    private String twoLiterMotor;
    private String threeLiterMotor;
    private String sixAndThreeLiterMotor;
    private String model;
    private String type;

    public Mercedes(String model, String complication, String colorWhite, String colorBlack, String colorCustom, String modelE211, String modelE212, String modelE213, String fourSecondTo100KmH, String sevenSecondTo100KmH, String twelveSecondTo100KmH, String twoLiterMotor, String threeLiterMotor, String sixAndThreeLiterMotor) {
        super(model, complication);
        this.colorWhite = colorWhite;
        this.colorBlack = colorBlack;
        this.colorCustom = colorCustom;
        this.modelE211 = modelE211;
        this.modelE212 = modelE212;
        this.modelE213 = modelE213;
        this.fourSecondTo100KmH = fourSecondTo100KmH;
        this.sevenSecondTo100KmH = sevenSecondTo100KmH;
        this.twelveSecondTo100KmH = twelveSecondTo100KmH;
        this.twoLiterMotor = twoLiterMotor;
        this.threeLiterMotor = threeLiterMotor;
        this.sixAndThreeLiterMotor = sixAndThreeLiterMotor;
    }

    public Mercedes(String model, String complication) {
        super(model, complication);
    }

    @Override
    public String getComplication() {
        return super.getComplication();
    }

    @Override
    public void setComplication(String complication) {
        super.setComplication(complication);
    }

    @Override
    public void speed() {

    }

    @Override
    public void limitFuel() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "colorWhite='" + colorWhite + '\'' +
                ", colorBlack='" + colorBlack + '\'' +
                ", colorCustom='" + colorCustom + '\'' +
                ", modelE211='" + modelE211 + '\'' +
                ", modelE212='" + modelE212 + '\'' +
                ", modelE213='" + modelE213 + '\'' +
                ", fourSecondTo100KmH='" + fourSecondTo100KmH + '\'' +
                ", sevenSecondTo100KmH='" + sevenSecondTo100KmH + '\'' +
                ", twelveSecondTo100KmH='" + twelveSecondTo100KmH + '\'' +
                ", twoLiterMotor='" + twoLiterMotor + '\'' +
                ", threeLiterMotor='" + threeLiterMotor + '\'' +
                ", sixAndThreeLiterMotor='" + sixAndThreeLiterMotor + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getColorWhite() {
        return colorWhite;
    }

    public void setColorWhite(String colorWhite) {
        this.colorWhite = colorWhite;
    }

    public String getColorBlack() {
        return colorBlack;
    }

    public void setColorBlack(String colorBlack) {
        this.colorBlack = colorBlack;
    }

    public String getColorCustom() {
        return colorCustom;
    }

    public void setColorCustom(String colorCustom) {
        this.colorCustom = colorCustom;
    }

    public String getModelE211() {
        return modelE211;
    }

    public void setModelE211(String modelE211) {
        this.modelE211 = modelE211;
    }

    public String getModelE212() {
        return modelE212;
    }

    public void setModelE212(String modelE212) {
        this.modelE212 = modelE212;
    }

    public String getModelE213() {
        return modelE213;
    }

    public void setModelE213(String modelE213) {
        this.modelE213 = modelE213;
    }

    public String getFourSecondTo100KmH() {
        return fourSecondTo100KmH;
    }

    public void setFourSecondTo100KmH(String fourSecondTo100KmH) {
        this.fourSecondTo100KmH = fourSecondTo100KmH;
    }

    public String getSevenSecondTo100KmH() {
        return sevenSecondTo100KmH;
    }

    public void setSevenSecondTo100KmH(String sevenSecondTo100KmH) {
        this.sevenSecondTo100KmH = sevenSecondTo100KmH;
    }

    public String getTwelveSecondTo100KmH() {
        return twelveSecondTo100KmH;
    }

    public void setTwelveSecondTo100KmH(String twelveSecondTo100KmH) {
        this.twelveSecondTo100KmH = twelveSecondTo100KmH;
    }

    public String getTwoLiterMotor() {
        return twoLiterMotor;
    }

    public void setTwoLiterMotor(String twoLiterMotor) {
        this.twoLiterMotor = twoLiterMotor;
    }

    public String getThreeLiterMotor() {
        return threeLiterMotor;
    }

    public void setThreeLiterMotor(String threeLiterMotor) {
        this.threeLiterMotor = threeLiterMotor;
    }

    public String getSixAndThreeLiterMotor() {
        return sixAndThreeLiterMotor;
    }

    public void setSixAndThreeLiterMotor(String sixAndThreeLiterMotor) {
        this.sixAndThreeLiterMotor = sixAndThreeLiterMotor;
    }

}
