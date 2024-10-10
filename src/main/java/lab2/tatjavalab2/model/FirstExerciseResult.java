package lab2.tatjavalab2.model;

public class FirstExerciseResult {
    private double sum1;
    private double sum2;
    private double eps;
    private double x;
    private int n;
    private double e;


    public FirstExerciseResult(double sum1, double sum2, double eps, double x, int n, double e) {
        this.sum1 = sum1;
        this.sum2 = sum2;
        this.eps = eps;
        this.x = x;
        this.n = n;
        this.e = e;
    }

    public String getSum1() {
        return String.format("%.11f", sum1);
    }

    public String getSum2() {
        return String.format("%.11f", sum2);
    }

    public String getEps() {
        return String.format("%.11f", eps);
    }

    public double getX() {
        return x;
    }

    public int getN() {
        return n;
    }

    public String getE() {
        return String.format("%.6f", e);
    }

}
