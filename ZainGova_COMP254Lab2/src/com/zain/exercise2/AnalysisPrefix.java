package com.zain.exercise2;

public class AnalysisPrefix {
    /*
    Perform an experimental analysis of the two algorithms prefixAverage1 and prefixAverage2,
    from lesson examples. Optionally, visualize their running times as a function of the input size
    with a log-log chart. Use either Java or Python graphical capabilities for visualization. Hint:
    Choose representative values of the input size n, similar to StringExperiment.java from class
    examples
    */

    public static double[] prefixAverage1(double[] x) {
        int n = x.length; // 2
        double[] a = new double[n]; // 3
        for (int j=0; j < n; j++) { // 0 - n
            double total = 0; // 2
            for (int i=0; i <= j; i++) // 0 - n
                total += x[i]; // 3
            a[j] = total / (j+1); // 5
        }
        return a; // 1
    }

    // O(n^2 + 16)

    public static double[] prefixAverage2(double[] x) {
        int n = x.length; // 2
        double[] a = new double[n]; // 3
        double total = 0; // 2
        for (int j=0; j < n; j++) { // 0 - n
            total += x[j]; // 3
            a[j] = total / (j+1); // 5
        }
        return a; // 1
    }

    // O(n + 16)
    // O(n)
}
