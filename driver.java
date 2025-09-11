

import org.w3c.dom.Node;

import linkedlists.DoublyLinkedList;

public class driver {
    public static void main(String[] args) {
        DoublyLinkedList<String> L = new DoublyLinkedList<String>();
        DoublyLinkedList<String> M = new DoublyLinkedList<String>();

        L.addFirst("1");
        L.addLast("2");
        L.addLast("3");

        M.addFirst("4");
        M.addLast("5");
        M.addLast("6");

        DoublyLinkedList<String> LPrime = DoublyLinkedList.concatenate(L, M);

        System.out.println("Concatenated lists L': " + LPrime);
    }
}
