package com.zain.exercise1;

public class Algorithm {
    public static int ProductRecursion(int m, int n) {
        if (m > n) { // minimize number of steps required
            if (n == 1) return m; // when n finally gets to 1, we return m
            return m + ProductRecursion(m, n - 1);
        } else {
            if (m == 1) return n; // when n finally gets to 1, we return m
            return n + ProductRecursion(m - 1, n);
        }

    }
}
