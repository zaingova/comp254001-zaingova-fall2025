package com.zain.ex2;

public class Driver {
    public static void main(String[] args) {
        SortedTableMap<Integer, String> map = new SortedTableMap<>();

        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");
        map.put(40, null);

        System.out.println("Contains 10? " + map.containKey(10));  // true
        System.out.println("Contains 25? " + map.containKey(25));  // false
        System.out.println("Contains 40? " + map.containKey(40));  // true
        System.out.println("Contains 50? " + map.containKey(50));  // false

        // test get() ambiguity case
        System.out.println("Value at 40 = " + map.get(40));
        System.out.println("Key 40 exists? " + map.containKey(40));
    }
}
