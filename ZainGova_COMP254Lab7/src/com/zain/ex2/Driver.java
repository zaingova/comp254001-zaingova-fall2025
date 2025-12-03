package com.zain.ex2;

import java.util.Comparator;

public class Driver {
    public static void main(String[] args) {
        Comparator<Integer> comp = (a, b) -> a.compareTo(b);

        Queue<Integer> q = new LinkedQueue<>();
        q.enqueue(85);
        q.enqueue(24);
        q.enqueue(63);
        q.enqueue(45);
        q.enqueue(17);
        q.enqueue(31);
        q.enqueue(96);
        q.enqueue(50);

        System.out.println("Original queue:");
        System.out.println(q);

        MergeSort.mergeSortBottomUp(q, comp);

        System.out.println("\nSorted queue:");
        System.out.println(q);
    }
}
