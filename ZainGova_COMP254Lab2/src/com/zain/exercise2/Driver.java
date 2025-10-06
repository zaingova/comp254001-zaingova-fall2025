package com.zain.exercise2;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        int[] inputSizes = {100, 500, 1000, 2000, 4000, 8000};
        Random rand = new Random();

        // Print header once
        System.out.printf("%-8s %-10s %-10s%n", "n", "Time1(ms)", "Time2(ms)");

        for (int n : inputSizes) {
            double[] x = new double[n];
            for (int i = 0; i < n; i++)
                x[i] = rand.nextDouble();

            // Time prefixAverage1
            long start = System.nanoTime();
            AnalysisPrefix.prefixAverage1(x);
            long end = System.nanoTime();
            double time1 = (end - start) / 1e6; // milliseconds

            // Time prefixAverage2
            start = System.nanoTime();
            AnalysisPrefix.prefixAverage2(x);
            end = System.nanoTime();
            double time2 = (end - start) / 1e6; // milliseconds

            // Print results for this n
            System.out.printf("%-8d %-10.3f %-10.3f%n", n, time1, time2);
        }
    }
}
