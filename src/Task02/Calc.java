package Task02;

import java.io.*;

public class Calc {

    private static final String FNAME = "Area.bin";
    private Area result;

    public Calc() {
        result = new Area();
    }

    public static double calc(String binarySide) {
        int decimalSide = Integer.parseInt(binarySide, 2);
        double sumOfAreas = 0;

        // Area of the equilateral triangle
        sumOfAreas += (Math.sqrt(3) / 4) * Math.pow(decimalSide, 2);

        // Area of the square
        sumOfAreas += Math.pow(decimalSide, 2);


        return Double.valueOf(String.format("%.2f", sumOfAreas));
    }

    public double init(String binarySide) {
        result.setBinarySide(binarySide);
        return result.setResult(calc(binarySide));
    }

    public void show() {
        System.out.println(result);
    }

    public Area getResult() {
        return result;
    }

    public void save() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(result);
        os.flush();
        os.close();
    }

    public void restore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        result = (Area) is.readObject();
        is.close();
    }
}
