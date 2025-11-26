package com.zain.ex1;

public class Driver {
    public static void main(String[] args) {
        LinkedBinaryTree<Integer> tree = new LinkedBinaryTree<>();
        Position<Integer> root = tree.addRoot(8);
        Position<Integer> n3 = tree.addLeft(root, 3);
        Position<Integer> n10 = tree.addRight(root, 10);
        Position<Integer> n1 = tree.addLeft(n3, 1);
        Position<Integer> n6 = tree.addRight(n3, 6);

        Position<Integer> next = tree.inOrderNext(n6);
        if (next != null)
            System.out.println("Next inorder node: " + next.getElement());
        else
            System.out.println("No successor.");

        // worse case running time is O(n) becuase we might need to traverse the whole tree

    }
}
