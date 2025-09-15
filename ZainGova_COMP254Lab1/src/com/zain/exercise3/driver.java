package com.zain.exercise3;

public class driver {
    public static void main(String[] args) throws CloneNotSupportedException {
        CircularlyLinkedList<String> L = new CircularlyLinkedList<String>();
        L.addFirst("One");
        L.addLast("Two");
        L.addLast("Three");
        L.addLast("Four");
        L.addLast("Five");

        CircularlyLinkedList<String> LClone = L.clone();

        System.out.println("Original list: " + L);
        System.out.println("Cloned list: " + LClone);
    }
}
