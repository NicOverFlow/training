package org.example;

import org.example.utils.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList linkedCustom = new LinkedList();
        linkedCustom.addLast(10);
        linkedCustom.addLast(20);
        linkedCustom.addLast(30);

        linkedCustom.addFirst(5);

        System.out.println(linkedCustom.contains(10));
        System.out.println(linkedCustom.contains(99));

        linkedCustom.printList();
        linkedCustom.reverse();
        linkedCustom.printList();
    }
}
