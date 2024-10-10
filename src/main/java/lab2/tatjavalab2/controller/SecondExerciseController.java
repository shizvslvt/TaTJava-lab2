package lab2.tatjavalab2.controller;

import lab2.tatjavalab2.model.SecondExerciseResult;

public class SecondExerciseController {

    private double[] xValues;
    private double[] yValues;

    public SecondExerciseResult calculate(double a, double b, double h) {
        int n = countStep(a, b, h);
        xValues = new double[n];
        yValues = new double[n];

        for (int i = 0; i < n; i++) {
            double x = a + i * h;
            if (x > b) break;
            xValues[i] = Double.parseDouble(String.format("%.9f", x));
            yValues[i] = Double.parseDouble(String.format("%.9f", f(x)));
        }

        return new SecondExerciseResult(xValues, yValues, a, b, h);
    }

    private double f(double x) {
        return Math.tan(x) / Math.log10(x);
    }

    public int countStep(double start, double end, double step) {
        if (start == end) return 0;
        return (int) Math.floor((end - start) / step + 1);
    }
}