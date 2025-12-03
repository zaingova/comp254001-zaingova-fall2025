package com.zain.ex1;

public class Driver {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        int keyValid = 3;
        int keyInvalid = 9;

        Position<Entry<Integer, String>> pos1 = map.treeSearchLoop(map.root(), keyValid);

        System.out.println("Searching for key: " + keyValid);
        if (!map.isExternal(pos1)) {
            System.out.println("Found node: " + pos1.getElement());
        } else {
            System.out.println("Node not found...");
        }

        Position<Entry<Integer, String>> pos2 = map.treeSearchLoop(map.root(), keyInvalid);

        System.out.println("\nSearching for key: " + keyInvalid);
        if (!map.isExternal(pos2)) {
            System.out.println("Found node: " + pos2.getElement());
        }  else {
            System.out.println("Node not found...");
        }

        // using recursive approach for validity
        System.out.println("\n" + map.get(keyValid));
        System.out.println(map.get(keyInvalid));
    }
}
