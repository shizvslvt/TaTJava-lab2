package lab2.tatjavalab2.model;

public class SecondExerciseResult {

    private double[] xValues;
    private double[] yValues;
    private double a;
    private double b;
    private double h;

    public SecondExerciseResult(double[] xValues, double[] yValues, double a, double b, double h) {
        this.xValues = xValues;
        this.yValues = yValues;
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double[] getXValues() {
        return xValues;
    }

    public double[] getYValues() {
        return yValues;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

}
