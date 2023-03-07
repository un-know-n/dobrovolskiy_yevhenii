package Task03;

import java.io.Serializable;

/**
 * Stores incoming data and caches the result, can be serialized
 */
public class Area implements Serializable {

    /**
     * Automatically generated constant
     */
    private static final long serialVersionUID = 1L;

    /**
     * Side to calculate the area by
     */
    // transient
    private String binarySide;

    /**
     * Result of the calculations
     */
    private double result;

    /**
     * Basic constructor without parameters
     */
    public Area() {
        this.result = 0;
        this.binarySide = "";
    }

    /**
     * Gets the binary side
     *
     * @return the binary side
     */
    public String getBinarySide() {

        return this.binarySide;
    }


    /**
     * Sets the binary side
     *
     * @param binarySide the binary side
     */
    public void setBinarySide(String binarySide) {

        this.binarySide = binarySide;
    }


    /**
     * Gets the result
     *
     * @return the result
     */
    public double getResult() {

        return result;
    }


    /**
     * Sets the result
     *
     * @param result the result
     * @return double
     */
    public double setResult(double result) {

        return this.result = result;
    }

    @Override

    /**
     *
     * Show the current result
     *
     * @return String
     */
    public String toString() {

        return "Sum of the areas: " + result;
    }
}