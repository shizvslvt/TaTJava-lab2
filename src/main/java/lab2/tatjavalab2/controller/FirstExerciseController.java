package lab2.tatjavalab2.controller;

import lab2.tatjavalab2.model.FirstExerciseResult;

public class FirstExerciseController {

    public FirstExerciseResult calculate(double x, int n, double e) {
        double lump = 1, sum1 = 1, sum2 = 1;
        double eps = Math.exp(x);

        for (int i = 1; i < n; i++) {
            lump = (lump * (x / i));
            sum1 = sum1 + lump;
            if (Math.abs(lump) > e) sum2 = sum2 + lump;
        }

        return new FirstExerciseResult(sum1, sum2, eps, x, n, e);
    }
}