package com.zain.exercise2;

public class Driver {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addFirst(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);

        System.out.println(list);
        // swap 2nd (20) and 4th (40) nodes
        // expected output is 10, 40, 30, 20, 50, 60
        list.swapNodes(1, 3); // access nodes by index becuase the Node class is protected
        System.out.println(list);
    }
}
