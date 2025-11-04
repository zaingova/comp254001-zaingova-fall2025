package com.zain.exercise3;

public class Driver {
    public static void main(String[] args) {
        LinkedQueue<String> Q = new LinkedQueue<>();
        LinkedQueue<String> Q2 = new LinkedQueue<>();

        Q.enqueue("One");
        Q.enqueue("Two");
        Q.enqueue("Three");
        Q2.enqueue("Four");
        Q2.enqueue("Five");
        Q2.enqueue("Six");

        System.out.println("Q:  " + Q + "\nQ2: " + Q2 + "\n");

        System.out.println("Combining lists...\n");
        Q.concatenate(Q2);

        System.out.println("Q:  " + Q + "\nQ2: " + Q2 + "\n");
    }
}
