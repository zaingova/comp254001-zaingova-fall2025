package com.zain.exercise2;

public class Driver {
    public static void main(String[] args) {
        ArrayStack<String> as1 = new ArrayStack<>();
        ArrayStack<String> as2 = new ArrayStack<>();

        as1.push("apple");
        as1.push("orange");
        as1.push("pear");

        as2.push("banana");
        as2.push("grapefruit");
        as2.push("mango");

        System.out.println("TOP --->     S: " + as1 + "     <---- BOTTOM");
        System.out.println("TOP --->     T: " + as2 + "     <---- BOTTOM\n");

        System.out.println("transferring...\n");
        StackUtils.transfer(as1, as2);

        System.out.println("TOP --->     S: " + as1 + "     <---- BOTTOM");
        System.out.println("TOP --->     T: " + as2 + "     <---- BOTTOM");
    }


}
