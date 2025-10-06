package com.zain.exercise1;

public class Exercises {
    /*
    Give a big-Oh characterization, in terms of n, of the running time of the example1
    method from Exercises.java class in Lesson 4 examples.
    */

    public static int example1(int[] arr) {
        int n = arr.length, total = 0; // 3
        for (int j=0; j < n; j++) // 0 - n
            total += arr[j]; // 2
        return total; // 1
    }

    // O(n + 6)
    // O(n)

    /*
    Give a big-Oh characterization, in terms of n, of the running time of the example2
    method from Exercises.java class in Lesson 4 examples.
    */

    public static int example2(int[] arr) {
        int n = arr.length, total = 0; // 3
        for (int j=0; j < n; j += 2) // 0 - n/2
            total += arr[j]; // 2
        return total; // 1
    }

    // O((n/2) + 6)
    // O(n)

    /*
    Give a big-Oh characterization, in terms of n, of the running time of the example3
    method from Exercises.java class in Lesson 4 examples.
    */

    public static int example3(int[] arr) {
        int n = arr.length, total = 0; // 3
        for (int j=0; j < n; j++) // 0 - n
            for (int k=0; k <= j; k++) // 0 - n
                total += arr[j]; // 2
        return total; // 1
    }

    // O(n^2 + 6)
    // O(n^2)

    /*
    Give a big-Oh characterization, in terms of n, of the running time of the example4
    method from Exercises.java class in Lesson 4 examples.
    */

    public static int example4(int[] arr) {
        int n = arr.length, prefix = 0, total = 0; // 4
        for (int j=0; j < n; j++) { // 0 - n
            prefix += arr[j]; // 3
            total += prefix; // 2
        }
        return total; // 1
    }

    // O(n + 8)
    // O(n)

    /*
    Give a big-Oh characterization, in terms of n, of the running time of the example5
    method from Exercises.java class in Lesson 4 examples.
    */

    public static int example5(int[] first, int[] second) {
        int n = first.length, count = 0; // 3
        for (int i=0; i < n; i++) { // 0 - n
            int total = 0; // 1
            for (int j=0; j < n; j++) // 0 - n
                for (int k=0; k <= j; k++) // 0 - n
                    total += first[k]; // 3
            if (second[i] == total) count++; // 2 - 3
        }
        return count;
    }
}
