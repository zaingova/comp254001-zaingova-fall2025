package com.zain.exercise3;

import java.util.Arrays;

public class AnalysisUniqueness {
    /*
    For each of the algorithms unique1 and unique2 (Uniqueness.java class in Lesson 4 examples)
    which solve the element uniqueness problem, perform an experimental analysis to determine the
    largest value of n such that the given algorithm runs in one minute or less. Hint: Do a type of “binary
    search” to determine the maximum effective value of n for each algorithm.
    */

    public static boolean unique1(int[] data) {
        int n = data.length;
        for (int j=0; j < n-1; j++)
            for (int k=j+1; k < n; k++)
                if (data[j] == data[k])
                    return false;
        return true;
    }

    public static boolean unique2(int[] data) {
        int n = data.length;
        int[] temp = Arrays.copyOf(data, n);
        Arrays.sort(temp);
        for (int j=0; j < n-1; j++)
            if (temp[j] == temp[j+1])
                return false;
        return true;
    }
}
