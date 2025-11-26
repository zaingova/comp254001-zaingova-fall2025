package com.zain.ex2;

public class Driver {
    public static void main(String[] args) {
        LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>();

        Position<Integer> root = t.addRoot(5);
        Position<Integer> n2 = t.addLeft(root, 3);
        Position<Integer> n3 = t.addRight(root, 8);
        Position<Integer> n4 = t.addLeft(n2, 1);
        Position<Integer> n5 = t.addRight(n2, 4);

        t.printHeights(t.root());
    }
}
