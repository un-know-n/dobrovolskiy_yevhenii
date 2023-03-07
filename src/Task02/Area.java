package Task02;

import java.io.Serializable;


public class Area implements Serializable {

    private static final long serialVersionUID = 1L;
    private String binarySide;
    private double result;

    public Area() {
        this.binarySide = "";
    }

    public Area(String side) {
        setBinarySide(side);
    }

    public String getBinarySide() {
        return this.binarySide;
    }

    public void setBinarySide(String binarySide) {
        this.binarySide = binarySide;
    }

    public double getResult() {
        return result;
    }

    public double setResult(double result) {
        return this.result = result;
    }

    @Override
    public String toString() {
        return "Sum of the areas: " + result;
    }
}
