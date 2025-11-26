package com.zain.ex1;

public class Driver {
    public static void main(String[] args) {
        // note: I can't find ProbeHashMap, so I just tested by code on ChainHashMap

        int n = 100000;
        double[] loadFactors = {0.25, 0.5, 0.75, 0.9};

        for (double loadFactor : loadFactors) {
            System.out.println("Load factor: " + loadFactor + "\n------------------------------------");
            ChainHashMap<Integer, Integer> chain = new ChainHashMap<>(17, loadFactor);

            long t1 = System.nanoTime();
            for (int i = 0; i < n; i++) {
                chain.put(i, i);
            }
            long t2 = System.nanoTime();

            System.out.println("ChainHashMap time: " + (t2 - t1) / 1_000_000.0 + " ms\n\n");
        }
    }
}
