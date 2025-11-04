package com.zain.exercise1;

public class Driver {
    public static void main(String[] args){
        LinkedPositionalList<String> lpl = new LinkedPositionalList<>();

        Position<String> position1 = lpl.addLast("first");
        Position<String> position2 = lpl.addLast("second");
        Position<String> position3 = lpl.addLast("third");
        Position<String> position4 = lpl.addLast("fourth");

        Position<String> invalid = new Position<String>() {
            @Override
            public String getElement() throws IllegalStateException {
                return "X";
            }
        };

        System.out.println("Testing valid index...");
        System.out.println("The index of the third element: " + lpl.indexOf(position3) + "\n");

        System.out.println("Testing invalid index...");
        System.out.println("The index of a foreign element: " + lpl.indexOf(invalid) + "\n");
    }
}
