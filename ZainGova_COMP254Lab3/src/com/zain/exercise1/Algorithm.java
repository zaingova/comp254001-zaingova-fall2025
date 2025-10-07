package com.zain.exercise1;

/* Create a recursive algorithm to compute the product of two positive integers, m and n, using
only addition and subtraction. Implement the Java or Python code. Hint: You need subtraction to
count down from m or n and addition to do the arithmetic needed to get the right answer. Check
linearSum method from Week 5 examples. */

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
